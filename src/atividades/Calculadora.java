package atividades;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5962244741640245637L;

	
	public Calculadora() {
		//Métodos construtores de Calculadora
		this.setSize(500, 300);
		this.setVisible(true);
		this.setResizable(true);
		
		Container c =  this.getContentPane();
		
		//lConfigurações de layouts
		JPanel painel_botoes = new JPanel();
		JPanel painel_rotulos = new JPanel();
		JPanel painel_caixas = new JPanel();
		
		BorderLayout layout = new BorderLayout();
		GridLayout layoutbotoes = new GridLayout(1,5,5,5);
		GridLayout layoutrotulos = new GridLayout(3,1,5,5);

		c.setLayout(layout);
		painel_botoes.setLayout(layoutbotoes);
		painel_rotulos.setLayout(layoutrotulos);
		painel_caixas.setLayout(layoutrotulos);
		
		//Rótulos e botões
		JLabel numero1 = new JLabel("Insira o primeiro número:\n");
		numero1.setToolTipText("Número");
		JTextField caixa = new JTextField(10);
		
		painel_rotulos.add(numero1);
		painel_caixas.add(caixa);

		
		JLabel numero2 = new JLabel("Insira o segundo número:");
		numero2.setToolTipText("Número");
		JTextField caixa2 = new JTextField(10);
		painel_rotulos.add(numero2);
		painel_caixas.add(caixa2);
		
		JLabel res = new JLabel("Resultado:");
		JTextField caixa3 = new JTextField(10);
		painel_rotulos.add(res);
		painel_caixas.add(caixa3);
		
		
		JButton btn_soma = new JButton("+");
		JButton btn_sub = new JButton("-");
		JButton btn_mult = new JButton("x");
		JButton btn_div = new JButton("/");
		JButton btn_cls = new JButton("C");
		
		painel_botoes.add(btn_soma);
		painel_botoes.add(btn_sub);
		painel_botoes.add(btn_mult);
		painel_botoes.add(btn_div);
		painel_botoes.add(btn_cls);
		
		//Adicionando painéis
		c.add(painel_botoes, BorderLayout.SOUTH);
		c.add(painel_rotulos, BorderLayout.WEST);
		c.add(painel_caixas, BorderLayout.CENTER);
		
	
		//Tratamento de Eventos
		btn_soma.addActionListener(new ActionListener()     
		{	public void actionPerformed(ActionEvent e)
			{ 
			double valor1, valor2;
			if(caixa.getText().equals("") || caixa2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Há campos vazios!");
			}
			else {
				valor1 = Double.parseDouble(caixa.getText());
				valor2 = Double.parseDouble(caixa2.getText());
				caixa3.setText("" + (valor1 + valor2));
			}
		}});
		
		btn_sub.addActionListener(new ActionListener()     
		{	public void actionPerformed(ActionEvent e)
			{ 
			double valor1, valor2;
			if(caixa.getText().equals("") || caixa2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Há campos vazios!");
			}
			else {
				valor1 = Double.parseDouble(caixa.getText());
				valor2 = Double.parseDouble(caixa2.getText());
				caixa3.setText("" + (valor1 - valor2));
			}
		}});
		
		btn_mult.addActionListener(new ActionListener()     
		{	public void actionPerformed(ActionEvent e)
			{ 
			double valor1, valor2;
			if(caixa.getText().equals("") || caixa2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Há campos vazios!");
			}
			else {
				valor1 = Double.parseDouble(caixa.getText());
				valor2 = Double.parseDouble(caixa2.getText());
				caixa3.setText("" + (valor1 * valor2));
			}
		}});
		
		btn_div.addActionListener(new ActionListener()     
		{	public void actionPerformed(ActionEvent e)
			{ 
			double valor1, valor2;
			if(caixa.getText().equals("") || caixa2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Há campos vazios!");
			}
			else {
				valor1 = Double.parseDouble(caixa.getText());
				valor2 = Double.parseDouble(caixa2.getText());
				caixa3.setText("" + (valor1 / valor2));
			}
		}});
		
		btn_cls.addActionListener(new ActionListener  ()
				{ public void actionPerformed (ActionEvent e)
					{
					caixa.setText("");
					caixa2.setText("");
					caixa3.setText("");
					}
				});
		
		
		
		
		
	}
	
	
	
	

}

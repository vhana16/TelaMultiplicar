package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MultiplicarController {
	
	private JTextField txtNum1;
	private JTextField txtNum2;
	
	public MultiplicarController(
			JTextField txtNum1,
			JTextField txtNum2) {
		
		this.txtNum1 = txtNum1;
		this.txtNum2 = txtNum2;
	}
	
	public ActionListener acaoCalcular() {
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String txt1 = txtNum1.getText().trim().replace(",",".");
				String txt2 = txtNum2.getText().trim().replace(",",".");
				
				double num1 = Double.parseDouble(txt1);
				double num2 = Double.parseDouble(txt2);
				
				double resultado = num1 * num2;
				
				String mensagem = "Resultado: " + resultado;
				
				JOptionPane.showMessageDialog(null, mensagem);
				
				
			}
		};
	}
	
	public ActionListener acaoSair() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		};
	}

	public ActionListener acaoLimpar() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtNum1.setText("");
				txtNum2.setText("");
				
				JOptionPane.showMessageDialog(null, "Campos limpos com sucesso!");
				
			}
		};
	}
}

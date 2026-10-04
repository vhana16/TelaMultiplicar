package pratica01;

import javax.swing.*;
import controllers.MultiplicarController;

public class TelaMultiplicar extends JFrame{

	private static final long serialVersionUID = 1L;
	JTextField txtNum1, txtNum2;
	JLabel lblNum1, lblNum2;
	JButton btnSair, btnLimpar, btnCalcular;
	
	public TelaMultiplicar() {
		setSize(500, 400);
		setLayout(null);
		setTitle("Multiplicar");
		setLocationRelativeTo(null);
		
		lblNum1 = new JLabel("Número 1:");
		lblNum1.setBounds(30, 50, 100, 25);
		add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(130, 50, 250, 25);
		add(txtNum1);
		
		lblNum2 = new JLabel("Número 2:");
		lblNum2.setBounds(30, 90, 100, 25);
		add(lblNum2);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(130, 90, 250, 25);
		add(txtNum2);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(80, 320, 100, 30);
		add(btnCalcular);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(200, 320, 100, 30);
		add(btnLimpar);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(320, 320, 100, 30);
		add(btnSair);
		
		MultiplicarController controller = new MultiplicarController(
				txtNum1,
				txtNum2
);
				
		btnCalcular.addActionListener(controller.acaoCalcular());
		btnSair.addActionListener(controller.acaoSair());
		btnLimpar.addActionListener(controller.acaoLimpar());
	}

}

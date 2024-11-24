package ExerciciosCorrigidos;

import javax.swing.JOptionPane;

public class DialogoSaldo {

	public static void main(String[] args) {

		String aux="";
		double deposito=0,saldo=0,retirada=0;
		
		try {
		aux=JOptionPane.showInputDialog("Valor do Depósito");
		deposito = Double.parseDouble(aux);
		
		saldo = saldo + deposito;//0+100.5
		JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + saldo);

		//Retirada/Saque
		aux=JOptionPane.showInputDialog("Informe o valor da retirada");
		retirada = Double.parseDouble(aux);
		
		//Variável saldo = calculo/subtracao
		//saldo= 100.5 -   10
		saldo = (saldo - retirada); //Acumulador
		JOptionPane.showMessageDialog(null, "Seu saldo atual é: " + saldo);

		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,
					"Digite valores numéricos!\n");
		}
	}

}

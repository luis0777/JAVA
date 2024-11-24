package ExerciciosCorrigidos;

import javax.swing.JOptionPane;

public class ApresentacaoFormal {

	public static void main(String[] args) {

		String unir="", formal, nome, sobreNome, idade, estado, rg;

		formal = JOptionPane.showInputDialog("Entre com a maneira Formal: Sr. ou Srta.");
		nome = JOptionPane.showInputDialog("Entre com o primeiro nome");
		sobreNome = JOptionPane.showInputDialog("Entre com o sobrenome");
		idade = JOptionPane.showInputDialog("Entre com a idade");
		estado = JOptionPane.showInputDialog("Informe o estado que você nasceu");
		rg = JOptionPane.showInputDialog("Informe o RG");

		
		unir=formal+" "
		  +nome+" "
		  +sobreNome
		  +", com a idade de " + idade
		  + " anos,\nestá registrado com a RG:"+rg
		  +",\ne seu nascimento no estado de " + estado;
		 
		
		
		// JOptionPane.showMessageDialog(null,
		// formal + " "
		// + nome + " "
		// + sobreNome
		// + ", com a idade de " + idade
		// + " anos,\nestá registrado com a RG:" + rg
		// + ",\ne seu nascimento no estado de " + estado);

		// Outra maneira
		JOptionPane.showMessageDialog(null, unir);
	}
	
}

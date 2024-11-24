package MetodosString;

import javax.swing.JOptionPane;

public class ExemploCharat {

	public static void main(String[] args) {
		String palavra="JAVA", aux="";//Cria as variáveis
		
		//Faz o looping de 0 até tamanho da palavra obtida por length()
		//Assim o looping passará por todos os caracteres
		//Apresenta o índice pelo cont
		//O aux é o acumululador apresentando cada letra e índice
		
		for(int cont=0;cont<palavra.length();cont++) {
			aux=aux+palavra.charAt(cont)+"-"+cont+" - "; //aux+= ou aux=aux +
		}                 
		
						//aux= J --> 0
						//aux= J --> 0
						//     A --> 1

						//aux= J --> 0
						//     A --> 1
						//     V --> 2

						// aux= J --> 0
						//      A --> 1
						//      V --> 2
						//      A --> 3

		JOptionPane.showMessageDialog(null, 
				"A palavra: "+palavra+", contem "+palavra.length()+" letras\n"+
				"Os índices são:\n"+ aux);
	}
}









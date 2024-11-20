import javax.swing.*;

public class CalculoIMC{
    public static  void main(String [] args) {
        int continuar;
        do {
            ImageIcon icon = new ImageIcon("C:\\Users\\PC\\Downloads\\icons8-coração-com-pulso-50.png"); //caminho da img
            JOptionPane.showMessageDialog(null, // esse null significa que a tela sempre aparecerá no centro
                    "O indice de massa corporal\nFormula: (Peso + Altura²)/2", //conteudo da caixa
                    "Calculadora de IMC", //cabelhaço da caixa
                    JOptionPane.INFORMATION_MESSAGE, //icon que aparece se eu não colocar img
                    icon); // img que apareça como icon

            float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso(use ponto em vez de virgula"));
            while (peso < 0) {
                JOptionPane.showMessageDialog(null,
                        "Peso invalido, tente novamente...",
                        "Erro",
                        JOptionPane.QUESTION_MESSAGE);
                peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso(use ponto em vez de virgula"));
            }

            float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua altura(use ponto em vez de virgula)"));
            while (altura < 0) {
                JOptionPane.showMessageDialog(null,
                        "Altura invalida, tente novamente...",
                        "Erro",
                        JOptionPane.QUESTION_MESSAGE);
            }

            float Imc = IMC(peso, altura);
            String situacao = Situacao(Imc);

            JOptionPane.showMessageDialog(null, "De acordo com o seu peso " + peso + " e altura " + altura +
                    "\nIMC: " + Imc + "\nSituação: " + situacao);

            continuar = JOptionPane.showConfirmDialog(null,"Deseja realizar outro calculo");

        }while (continuar == JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "Programa Encerrado", "Fim", JOptionPane.INFORMATION_MESSAGE);
    }

    static float IMC(float peso, float altura){
        float resultadoIMC = (peso + altura * altura)/2;
        return resultadoIMC;
    }
    static  String Situacao(float imc){
        String resultado;
        if(imc < 16){
            resultado = "Baixo Peso(grau I)";
            return resultado;
        } else if (imc < 16.99) {
            resultado = "Baixo Peso(grau II)";
            return resultado;
        } else if (imc < 18.49) {
            resultado = "Baixo do Peso(grau III)";
            return resultado;
        } else if (imc < 24.99) {
            resultado = "Peso Adequado";
            return resultado;
        } else if (imc < 29.99) {
            resultado = "Sobrepeso";
            return  resultado;
        } else if (imc < 34.99) {
            resultado = "Obesidade(grau I)";
            return resultado;
        } else if (imc < 39.99) {
            resultado = "Obesidade(grau II)";
            return resultado;
        }else{
            resultado = "Obesidade(grau III)";
            return resultado;
        }
    }
}

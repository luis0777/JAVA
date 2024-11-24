package  ExemplosJOptionPane;
import javax.swing.JOptionPane;

public class JOptionLista {
    public static void main(String[] args) {
        // Array de opções
        String[] options = { "Java", "JavaScript", "C#","Não tenho" };
        
        /*
         null: Deixamos como padrão null para o componente pai
        "Escolha sua Linguagem Preferida": A mensagem que será exibida no diálogo
        "Seleção de Linguagem": O título da janela de diálogo
        JOptionPane.QUESTION_MESSAGE: ícone de interrogação
        null: Não há ícone
        options: Um array de objetos {"Java", "Python", ...}
        options[0]: O valor padrão selecionado quando a caixa de diálogo é exibida
         */
        String escolha = (String) JOptionPane.showInputDialog(null,
                "Escolha sua Linguagem Preferida",
                "Seleção de Linguagem",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        JOptionPane.showMessageDialog(null, "Você escolheu: " + escolha);
    }
}


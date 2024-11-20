import javax.swing.*;

public class JOptionIcone{
    public static  void main (String [] args){
        // Fonte do icone: https://www.iconfinder.com/search?q=java&price=free

        //Altere o caminho onde estara sua imagem
        ImageIcon icon = new ImageIcon("C:\\Users\\PC\\OneDrive\\Imagens\\CADEADO ABERTO.jfif");

        JOptionPane.showMessageDialog(null, "Mensagem com icone personalizado!", "Seu icone",
                JOptionPane.INFORMATION_MESSAGE, icon);
    }
}

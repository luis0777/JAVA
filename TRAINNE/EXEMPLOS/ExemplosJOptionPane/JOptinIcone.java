package  ExemplosJOptionPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class JOptinIcone {
    public static void main(String[] args) {
        // Fonte do icone: https://www.iconfinder.com/search?q=java&price=free

        // Altere o caminho onde estara sua imagem
        ImageIcon icon = new ImageIcon("Z:\\OneDrive\\trainee\\JavaCodigoFonts\\AppJava\\src\\exemplosJoPane\\369797_application_coffee_cup_java_x_icon.png");
        
        JOptionPane.showMessageDialog(null, "Mensagem com ícone personalizado!", "Seu Ícone",
                JOptionPane.INFORMATION_MESSAGE, icon);
    }
}


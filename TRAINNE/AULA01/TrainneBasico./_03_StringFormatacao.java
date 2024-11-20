public class _03_StringFormatacao {
    public static void main(String[] args) {
        String nome ="Ragnar";
        String sNome ="Lodbrok";
        int idade =30;
        float valor = 55.18989f;
        System.out.println(String.format("Meu nome e %s, eu tenho %d anos e hoje gastei %.3f reais", nome,idade,valor));
        System.out.println(String.format("Meu nome e %s %s, eu tenho %d anos e hoje gastei %.2f reais", nome,sNome,idade,valor));
    }
}

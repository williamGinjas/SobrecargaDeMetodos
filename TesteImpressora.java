public class TesteImpressora {
    
    public static void main(String[] args) {
        Impressora imprimir = new Impressora();
        float f1 = 1.6f;
        float f2 = 2.5f;
        int a = 1;
        int b = 2;
        String s1 = "abc";
        String s2 = "def";
        String s3 = "ghi";
        
        imprimir.exibir(f1);

        imprimir.exibir(f1, f2);

        imprimir.exibir(f1, s1);

        imprimir.exibir(s1, f1);

        imprimir.exibir(s1, s2, s3);

        imprimir.exibir(a, b, s1);
    }
}
public class TesteCalculadoraCientifica {
    
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        int i1 = 4;
        double d1 = 5.5;
        String s = "145";
        byte a = 2, b= 4;
        String s1 = "8", s2 = "4";
        int x = 8;
        double z = 7;

        calc.raiz(i1);
        calc.raiz(d1);
        calc.raiz(s);
        calc.potencia(a, b);
        calc.potencia(s1, s2);
        calc.potencia(x, z);

    }
}

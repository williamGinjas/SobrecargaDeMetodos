public class CalculadoraCientifica {

    public void raiz (int i1){
        System.out.println(Math.sqrt((double) i1));
    }

    public  void  raiz(double d1){
        System.out.println(Math.sqrt((double)d1));
    }

    public  void  raiz(String s){
        System.out.println(Math.sqrt(Double.parseDouble(s)));
    }

    public  void potencia(byte a, byte b){
        System.out.println(Math.pow((double)a, b ));
    }

    public void potencia(String s1, String s2){
        System.out.println(Math.pow(Double.parseDouble(s1),Double.parseDouble(s2)));
    }

    public void potencia(int x, double z){
        System.out.println(Math.pow((double)x,z));
    }
    
}  
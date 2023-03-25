public class Main {
    public static void main(String[] args) {
        // Primera parte
        int resultado = 0;
        resultado = suma(5, 20, 14);
        System.out.println("La suma es: " +resultado);

        // Segunda parte
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println("El número de puertas es: " +miCoche.numeroPuertas);

    }

    // Primera parte
    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    // Segunda parte
    static class Coche{
        public int numeroPuertas = 0;
       public void sumarPuertas(){
           this.numeroPuertas++;
       }
    }
}
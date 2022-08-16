public class Main {
    public static void main(String[] args) {
        System.out.println(suma(10, 15, 20));
        coche miCoche = new coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}

class coche {
    int puertas;

    public int incrementarPuertas() {
        return puertas++;
    }
}
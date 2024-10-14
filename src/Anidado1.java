public class Anidado1 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 1000; numero++) {
            int sumaDivisores = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }
            if (sumaDivisores == numero) {
                System.out.println(numero + " es un número perfecto.");
            }
        }
    }
}

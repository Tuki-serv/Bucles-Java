import java.util.Scanner;
public class Anidado2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            int factorial = 1;

            // Calcular el factorial del número i
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            System.out.println("El factorial de " + i + " es " + factorial);
        }
    }
}

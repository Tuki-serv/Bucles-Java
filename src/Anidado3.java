import java.util.Scanner;
public class Anidado3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();
        int sumaFactoriales = 0;
        for (int i = 0; i <= N; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sumaFactoriales += factorial;
        }
        System.out.println("La suma de los factoriales desde 0 hasta " + N + " es " + sumaFactoriales);
    }
}

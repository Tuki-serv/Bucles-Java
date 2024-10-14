public class Anidado5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            String numero = "" +
                                    (i == 3 ? "E" : i) +
                                    (j == 3 ? "E" : j) +
                                    (k == 3 ? "E" : k) +
                                    (l == 3 ? "E" : l) +
                                    (m == 3 ? "E" : m);
                            System.out.println(numero);
                        }
                    }
                }
            }
        }
    }
}

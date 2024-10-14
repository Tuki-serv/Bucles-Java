public class Funciones4 {
    public static void main(String[] args) {
        String[] clientes = {"Juan", "María", "Carlos", "Ana", "Luis", "Sofía", "Pedro", "Lucía"};
        int[] compras = {5, 12, 9, 15, 3, 11, 7, 20};
        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes que reciben descuento de fidelización:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                double descuento = 10.0;
                System.out.println(clientes[i] + " - Compras: " + compras[i] + " - Descuento: " + descuento + "%");
            }
        }
    }
}

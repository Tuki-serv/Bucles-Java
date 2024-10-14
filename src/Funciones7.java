public class Funciones7 {
    public static void main(String[] args) {
        double[] compras = {350.0, 600.50, 450.75, 800.0, 120.0, 520.0};
        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        System.out.println("Compras con descuento aplicado (mayores a $500):");
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                double descuento = compras[i] * 0.15;
                double totalConDescuento = compras[i] - descuento;
                System.out.println("Compra original: $" + compras[i] + " - Total con descuento: $" + totalConDescuento);
            } else {
                System.out.println("Compra original: $" + compras[i] + " - No aplica descuento");
            }
        }
    }
}

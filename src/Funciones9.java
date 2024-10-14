public class Funciones9 {
    public static void main(String[] args) {
        double[] preciosOriginales = {100.0, 250.0, 75.5, 120.0, 300.0};
        calcularPrecioFinal(preciosOriginales);
    }

    public static void calcularPrecioFinal(double[] preciosOriginales) {
        double descuento = 0.10;
        System.out.println("Precios finales después del descuento:");
        for (int i = 0; i < preciosOriginales.length; i++) {
            double precioFinal = preciosOriginales[i] - (preciosOriginales[i] * descuento);
            System.out.println("Precio original: $" + preciosOriginales[i] + " - Precio final: $" + precioFinal);
        }
    }
}

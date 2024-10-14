public class Funciones6 {
    public static void main(String[] args) {
        double[] facturas = {100.0, 250.50, 300.75, 450.0, 120.0};
        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        System.out.println("Facturas con el impuesto del 21% aplicado:");
        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * 0.21;
            double totalConImpuesto = facturas[i] + impuesto;
            System.out.println("Factura original: $" + facturas[i] + " - Total con impuesto: $" + totalConImpuesto);
        }
    }
}

public class Funciones3 {
    public static void main(String[] args) {
        String[] clientes = {"Juan", "María", "Carlos", "Ana", "Luis", "Sofía", "Pedro", "Lucía"};

        double[] facturasPendientes = {450.75, 1200.50, 320.00, 780.25, 600.00, 499.99, 1300.00, 525.30};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");

        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Factura Pendiente: $" + facturasPendientes[i]);
            }
        }
    }
}
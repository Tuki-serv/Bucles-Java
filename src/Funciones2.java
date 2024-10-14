public class Funciones2 {
    public static void main(String[] args) {
        String[] productos = {"Laptop", "Monitor", "Teclado", "Mouse", "Auriculares", "Impresora", "Cámara", "Disco Duro"};

        int[] stocks = {10, 2, 15, 1, 5, 4, 8, 3};


        generarReporteBajoStock(productos, stocks);
    }
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con menos de 5 unidades en stock:");

        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " - Stock: " + stocks[i]);
            }
        }
    }
}
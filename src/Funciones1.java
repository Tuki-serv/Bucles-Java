public class Funciones1 {
    public static void main(String[] args) {
        double[] ventas = {100.5, 200.75, 150.0, 175.25, 210.0, 190.5, 225.0,
                300.0, 125.5, 210.75, 250.0, 270.25, 220.0, 180.75,
                160.0, 190.0, 300.5, 210.0, 185.0, 205.75, 250.5,
                215.0, 275.0, 300.0, 190.5, 250.0, 220.75, 180.0,
                200.5, 225.0};
        double ingresosTotales = calcularIngresosMensuales(ventas);

        System.out.printf("Los ingresos totales del mes son: %.2f\n", ingresosTotales);
    }
    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;

        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return total;
    }
}

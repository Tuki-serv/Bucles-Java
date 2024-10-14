public class Funciones5 {
    public static void main(String[] args) {
        int[] calificaciones = {4, 5, 3, 2, 5, 4, 3, 5, 4, 1};
        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción del cliente es: " + promedio);
    }
    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        double promedio = (double) suma / calificaciones.length;
        return promedio;
    }
}

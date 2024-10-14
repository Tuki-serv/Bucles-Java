public class Funciones8 {
    public static void main(String[] args) {
        String[] empleados = {"Juan", "Ana", "Carlos", "María", "Pedro"};
        int[] horasTrabajadas = {40, 35, 45, 50, 38};
        calcularPagoSemanal(empleados, horasTrabajadas);
    }
    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        int tasaPagoPorHora = 15;

        System.out.println("Pago semanal de los empleados:");
        for (int i = 0; i < empleados.length; i++) {
            int pagoSemanal = horasTrabajadas[i] * tasaPagoPorHora;
            System.out.println(empleados[i] + ": $" + pagoSemanal);
        }
    }
}

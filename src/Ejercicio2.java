import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ingrese la cantidad de empleados");
        int empleados, horas, salarioFijo = 15, salario, i = 1;
        empleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados"));
        while (i < empleados+1){
            horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas del "+ i+ "º empleado"));
            salario = salarioFijo + horas;
            JOptionPane.showMessageDialog(null,"El salario del "+ i +"º empleado es: $"+ salario);
        }
    }
}

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int empleados,horaFija = 40, horas,extras = 0, i = 1;
        empleados = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados:"));
        do {
            horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Horas del "+i+"º empleado"));
            if (horas > horaFija){
                extras = horas - horaFija;
                JOptionPane.showMessageDialog(null,"El "+i+"º empleado trabajo "+extras+" horas extras");
            } else if (horas < horaFija) {
                JOptionPane.showMessageDialog(null,"El "+i+"º empleado no trabajo las horas que le correspodian");
            } else
                JOptionPane.showMessageDialog(null,"El "+i+"º empleado no trabajo horas extras");
             i++;
        }while (i <= empleados);
    }
}
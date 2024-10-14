import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int semana = 7, ventas, total = 0;
        for (int i = 1; i <= semana; i++){
            ventas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las ventas del "+i+"º día"));
            total = total + ventas;
        }
        JOptionPane.showMessageDialog(null,"Las ventas totales fueron: $"+total);
    }
}

import  javax.swing.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Vamos a ver cuanto tiempo usas");
        JOptionPane.showMessageDialog(null,"Ingresa las horas de las actividades");
        JOptionPane.showMessageDialog(null,"Estudio, Hacer Ejercicio, Leer, Tiempo Libre");
        int suma = 0, horas, i = 1;
        while (i < 5){
            horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas de la "+ i + "º actividad:"));
            suma = horas + suma;
            i++;
        }
        JOptionPane.showMessageDialog(null,"Tiempo total dedicado a actividades: "+ suma);
    }
}
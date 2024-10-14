import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidad, disponible, minimo = 5;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos:"));
        for (int i =1; i <= cantidad; i++){
            disponible = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad del "+i+"º producto"));
            if (disponible >= minimo)
                JOptionPane.showMessageDialog(null,"No hace falta realizar el pedido");
            else
                JOptionPane.showMessageDialog(null,"Si hace falta realizar el pedido");
        }
    }
}

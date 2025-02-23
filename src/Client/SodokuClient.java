package Client;

import javax.swing.JOptionPane;

public class SodokuClient {
    public static void main(String[] args) {
        int choice = 0;

        do {
            String menu = "Seleccione una opción:\n"
                    + "1. Matriz 4x4\n"
                    + "2. Matriz 9x9\n"
                    + "3. Matriz 16x16\n"
                    + "5. Salir";

            String input = JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.PLAIN_MESSAGE);

            // Si se presiona Cancelar, salimos del programa
            if (input == null) {
                break;
            }

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (choice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Matriz 4x4", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Matriz 9x9", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Matriz 16x16", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (choice != 5);
    }
}

package Client;

import java.util.Scanner;

public class SodokuClient {
    public static void main(String[] args) {
        int choice = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("1. Matriz 4x4");
                System.out.println("2. Matriz 9x9");
                System.out.println("3. Matriz 16x16");
                System.out.println("5. Salir");
                System.out.print("OPCIÓN: ");

                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                } else {
                    System.out.println("Por favor ingresa un número válido.");
                    scanner.next(); // consume la entrada no válida
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.println("Has seleccionado Matriz 4x4");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Matriz 9x9");
                        break;
                    case 3:
                        System.out.println("Has seleccionado Matriz 16x16");
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } while (choice != 5);
        }
    }
}

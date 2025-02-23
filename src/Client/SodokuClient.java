package Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SodokuClient {
    int choice = 0 ;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    do {
       System.out.println("1.Matriz 4x4");
       System.out.println("2.Matriz 9x9");
       System.out.println("2.Matriz 16x16");
       System.out.println("5.Salir    ");
       System.out.println("OPCION:");
       choice=Integer.parseInt(br.readLine());
    }while (choice !=5);
}

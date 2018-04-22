package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.printf("Ingrese su Nombre:");
        String nombre= scan.nextLine();
        System.out.println();
        System.out.println("Buenas Tardes");
        System.out.println("Hola "+nombre);
        
    }
}

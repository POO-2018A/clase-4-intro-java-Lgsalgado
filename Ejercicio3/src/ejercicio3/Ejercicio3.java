package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        double edad=1.0;
        Scanner scan= new Scanner(System.in);

        System.out.printf("Ingrese su edad en años: ");
        edad= scan.nextDouble();
        System.out.println();
        if (edad<18){
            while (edad<0){
                System.out.println("INGRESE UNA EDAD CORRECTA POSITIVA");
                System.out.println("Ingrese su edad");
                edad= scan.nextInt();
            }
            System.out.println("USTED ES MENOR DE EDAD");

        }else{
            System.out.println("USTED ES MAYOR DE EDAD");
        }
        System.out.println("GRACIAS");
    }
}

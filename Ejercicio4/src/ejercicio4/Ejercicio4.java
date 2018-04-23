package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        double numero=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("VAMOS A VERIFICAR TU NUMERO ES PAR O IMPAR");
        System.out.printf("Ingresa tu numero: ");
        numero=scan.nextDouble();

        if (numero%2==0){
            System.out.println("SU NUMERO ES PAR");
        }else{
            System.out.println("SU NUMERO ES IMPAR");
        }
        System.out.println();
        System.out.println("GRACIAS");

    }
}

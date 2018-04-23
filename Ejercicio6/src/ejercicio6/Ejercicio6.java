package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        int aux=0; //Esta variable sera usada para ingresar los valores  positivo y negativo
        boolean nevando=false;
        boolean lloviendo=true;
        double temperatura=60.0;
        Scanner scan= new Scanner(System.in);

        System.out.println("INFORME DEL CLIMA");
        System.out.println("Si esta nevando ingrese '1' caso contrario ingrese '0'");
        aux=scan.nextInt();
        if (aux==1) {
            nevando = true;
        }else{
            nevando= false;
        }
        System.out.println("Si esta lloviendo ingrese '1' caso contrario ingrese '0'");
        aux=scan.nextInt();
        if (aux==1) {
            lloviendo = true;
        }else{
            lloviendo = false;
        }
        System.out.println("Ingrese la temperatura del ambiente");
        temperatura=scan.nextDouble();

        System.out.println("En conclusion");

        if (nevando|| lloviendo|| temperatura<10){
            System.out.println("Nos quedamos en casa!");
        } else {
            System.out.println("Vamos afuera!");
        }

        System.out.println();
        System.out.println("GRACIAS");
    }
}

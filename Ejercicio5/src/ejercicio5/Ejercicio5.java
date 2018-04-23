package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        int opcion=1;
        Scanner scan=new Scanner(System.in);


        do {
            System.out.println("Ingrese un mes recuerde que van de acuerdo del 1 al 12");
            System.out.println("INGRESE '0' PARA SALIR" );
            opcion=scan.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("SALIR");
                    System.out.println("GRACIAS");
                case 1:
                    System.out.println("Usted esta en ENERO");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Usted esta en FEBRERO");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Usted esta en MARZO");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Usted esta en ABRIL");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Usted esta en MAYO");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Usted esta en JUNIO");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Usted esta en JULIO");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Usted esta en AGOSTO");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Usted esta en SEPTIEMBRE");
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Usted esta en OCTUBRE");
                    System.out.println();
                    break;
                case 11:
                    System.out.println("Usted esta en NOVIEMBRE");
                    System.out.println();
                    break;
                case 12:
                    System.out.println("Usted esta en DICIEMBRE");
                    System.out.println();
                    break;
                default:
                    System.out.println("Usted ingreso una opcion EQUIVOCADA");
                    System.out.println();
                    break;

            }
        }while(opcion!=0);
    }
}

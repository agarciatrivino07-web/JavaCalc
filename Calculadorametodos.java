// Crear una calculadora mediante metodos
import java.util.Scanner;
public class CalculadoraMetodos { 

    public static void menu(){
        System.out.println("Elegir una opción: ");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Tabla de multiplicar");
    }

    public static void main(String [] args){

        menu();
        Scanner sc = new Scanner(System.in);

        int opcion = insertarOpcion(sc);

        int num1 = insertarNumero(sc, "primer");
        int num2 = insertarNumero(sc, "segundo");

        operations(num1, num2, opcion);

        sc.close();
    }


    public static int insertarOpcion(Scanner sc) {
        System.out.println("Insertar opción: ");
        return sc.nextInt();
    }

    public static int insertarNumero(Scanner sc, String orden){
        System.out.println("Insertar " + orden + " numero ");
        return sc.nextInt();
    }


    public static void operations(int num1, int num2, int opcion) {

        switch (opcion){
            case 1:
                System.out.println("La suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es: " + (num1 - num2));
                break;
            case 3: 
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;
            case 4:
                if (num1 == 0){
                    System.out.println("No se puede dividir ente cero");
                } else if (num2 == 0) {

                    System.out.println("No se puede divivir entre cero");
                }else {
                    System.out.println("La dvivisión es: " + (num1 / num2));
                }
                break;
            case 5:
                for(int i = 0; i <= 10; i++){
                    System.out.println(num1 + " x " + i + " = " + num1 * i);
                }
                break;
                // Se esta trabajando en ello para mejorarlo
            default:
                System.out.println("No válido");
        }

    }    
}


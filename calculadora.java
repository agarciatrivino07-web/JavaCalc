import java.util.Scanner;

public class Calculadora {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a la calculadora de Axel, espero que cumpla con su funcion.");
		System.out.println("Opciones");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. Disión");
		System.out.println("5. Raíz cuadrada");

		
		System.out.println("Opción seleccionada");
		int opt = sc.nextInt();

		System.out.println("Primer valor");
		double num1 = sc.nextDouble();

		System.out.println("Segundo valor");
		double num2 = sc.nextDouble();

		/*if(opt == 5) {
			System.out.println("Toca raíz cuadrada");
			System.out.println("Primer valor");
			//double num1 = sc.nextDouble();
		}
		if ((opt == 1 && opt == 2) || (opt == 3 && opt == 4 )) {
			System.out.println("Segundo valor");
			//double num2 = sc.nextDouble();
		}*/

		switch(opt) {

			case 1:
				System.out.println("Resultado " + (num1 + num2));
				break;
			case 2:
				System.out.println("Resultado " + (num1 - num2));
				break;
			case 3:
				System.out.println("Resultado " + (num1 * num2));
				break;
			case 4:
				if (num2 != 0)
					System.out.println("Resultado " + (num1 / num2));
				else
					System.out.println("No se puede dividir entre cero");
				break;
			case 5:
				double raiz1 = Math.sqrt(num1);
				System.out.println("La raíz cuadrada de " + num1 + " es: " + raiz1);
				break;
			default:
				System.out.println("Numero invalido");
				break;
		}

	sc.close();
	
	}
}	

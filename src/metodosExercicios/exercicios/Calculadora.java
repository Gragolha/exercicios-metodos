package metodosExercicios.exercicios;

public class Calculadora {

	public static void soma(int numero1, int numero2) {

		int resultado = numero1 + numero2;

		System.out.println("Soma de: " + numero1 + " + " + numero2 + " = " + resultado);

	}

	public static void multiplicação(int numero1, int numero2) {

		int resultado = numero1 * numero2;

		System.out.println("Multiplicação de: " + numero1 + " x " + numero2 + " = " + resultado);

	}
	public static void divisão(double numero1, double numero2) {

		double resultado = numero1 / numero2;

		System.out.println("Divisão de: " + numero1 + " / " + numero2 + " = " + resultado);

	}
	
	public static void subtração(int numero1, int numero2) {

		int resultado = numero1 - numero2;

		System.out.println("Subtração de: " + numero1 + " - " + numero2 + " = " + resultado);

	}

}

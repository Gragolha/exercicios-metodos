package metodosExercicios.interfaces;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Calculadora teste = new Calculadora();
		
		
		int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		teste.soma(num1, num2);
		teste.divisao(num1, num2);
		teste.subtracao(num1, num2);
		teste.multiplicacao(num1, num2);
		

	}

}

package metodosExercicios.exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Calculadora.");

		int n1, n2;

		n1 = scan.nextInt();

		n2 = scan.nextInt();
		System.out.println("Numero 1 = " + n1 + ", " + "Numero 2 = " + n2);

		Calculadora.soma(n1, n2);
		Calculadora.divisão(n1, n2);
		Calculadora.multiplicação(n1, n2);
		Calculadora.subtração(n1, n2);

		System.out.println(" ");
		System.out.println("Mensagens do dia");

		int hora;
		System.out.println("Que horas são?");
		hora = scan.nextInt();

		Mensagens.mensagens(hora);
		System.out.println("");

		System.out.println("Emprestimo");
		
		int parcelas;
		double valor;
		System.out.println("quanto você quer?");
		valor = scan.nextDouble();
		System.out.println("em quantas parcelas?");
		parcelas =  scan.nextInt();
		
		Emprestimo.calcular(valor, parcelas);
		
		
	}

}

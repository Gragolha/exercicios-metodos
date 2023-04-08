package metodosExercicios.interfaces;

public class Calculadora implements OperacoesMatematicas {

	@Override
	public void soma(int numero1, int numero2) {
		System.out.println(numero1 + numero2);
	}

	@Override
	public void subtracao(int numero1, int numero2) {
		System.out.println(numero1 - numero2);
		
	}

	@Override
	public void multiplicacao(int numero1, int numero2) {
		System.out.println(numero1 * numero2);
		
	}

	@Override
	public void divisao(double numero1, double numero2) {
		System.out.println(numero1 / numero2);
		
	}
	
	
	
	
		

	 


}

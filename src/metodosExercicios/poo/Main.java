package metodosExercicios.poo;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro();

		carro.setCor("azul");
		carro.setModelo("kombi");
		carro.setCapacidadeTanque(31);

		System.out.println(carro.getModelo());
		System.out.println(carro.getCor());
		System.out.println(carro.getCapacidadeTanque());

		System.out.println(carro.totalValorTanque(6.49));
		System.out.println(" ");

		Carro carro2 = new Carro("verde", "palio", 35);

		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(6.49));

	}
}
package metodosExercicios.exercicios;

public class Mensagens {

	public static void mensagens(int hora) {

		if (hora >= 5 && hora <= 10) {
			System.out.println("Bom dia, coffe *-*");
		} else if (hora >= 11 && hora <= 17) {
			System.out.println("Bom tarde, coffe da tardi!!! *-*");
		} else if (hora >= 18 && hora <= 23) {
			System.out.println("Bom noite, sem coffe e sim pizza!!! *-*");
		} else if (hora >= 24 && hora <= 4) {
			System.out.println("madruga, vai dormi >.<");
		} else
			System.out.println("Essa hora não existe");
	}

}

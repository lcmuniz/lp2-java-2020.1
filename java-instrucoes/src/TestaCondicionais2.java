
public class TestaCondicionais2 {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		int idade = 12;
		int quantidadePessoas = 3;
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Bem vindo.");
		}
		else {
			System.out.println("Infelizmente você não pode entrar.");
		}
		
		System.out.println("O switch");
		
		int mes = 10;
		
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			System.out.println("Começo do ano");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		default:
			System.out.println("Já passou do meio do ano!");
			break;
		}
		
	}

}

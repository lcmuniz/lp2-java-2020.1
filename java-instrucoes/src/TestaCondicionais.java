
public class TestaCondicionais {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 12;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
			System.out.println("Parabéns");
		}
		else if (quantidadePessoas >= 2) {
			System.out.println("Você não é maior de idade mas está acompanhado.");
		}
		else {
			System.out.println("Infelizmente você não pode entrar.");
		}
		
	}

}

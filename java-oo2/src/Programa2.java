





public class Programa2 {

	public static void main(String[] args) {
	
		Cliente joao = new Cliente();
		joao.nome = "João da Silva";
		joao.cpf = "788637546-34";
		
		Cliente maria = new Cliente();
		maria.nome = "Maria José";
		maria.cpf = "783763449-22";
		
		Conta conta123 = new Conta();
		conta123.dono = joao;
		conta123.saldo = 1000;
		conta123.numero= 123;
		
		Conta conta533 = new Conta();
		conta533.dono= maria;
		conta533.saldo = 100;
		conta533.numero= 533;
		
		System.out.println(conta123.numero);
		System.out.println(conta123.saldo);
		System.out.println(conta123.dono.nome);
		System.out.println(conta123.dono.cpf);

		joao.nome = "João Alberto da Silva";
		
		
		System.out.println(conta123.numero);
		System.out.println(conta123.saldo);
		System.out.println(conta123.dono.nome);
		System.out.println(conta123.dono.cpf);
	
	}
	
}

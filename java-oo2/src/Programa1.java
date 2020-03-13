import java.util.Date;

public class Programa1 {

	public static void main(String[] args) {

		Gerente mario = new Gerente();
		mario.nome = "Mario Albuquerque";
		mario.cpf = "777333555-77";
		mario.matricula = "AJ72384732";
		
		Cliente joao = new Cliente();
		joao.nome = "João da Silva";
		joao.cpf = "929939929-22";
		joao.dataDeNascimento = new Date();
		
		Cliente maria = new Cliente();
		maria.nome = "Maria Augusta";
		maria.cpf = "847342222-23";

		Conta contaJoao = new Conta();
		
		contaJoao.agencia = 2123;
		contaJoao.numero = 234234;
		contaJoao.titular = joao;
		contaJoao.saldo = 1000;
		
		ContaEspecial contaMaria = new ContaEspecial();
		
		contaMaria.agencia = 2123;
		contaMaria.numero = 21231;
		contaMaria.titular = maria;
		contaMaria.saldo = 300;
		contaMaria.valorChequeEspecial = 1000;
		
		System.out.println("Saldo de Maria: " + contaMaria.saldo);
		System.out.println("Limite disponível de Maria: " + contaMaria.limiteAtual());

		System.out.println("Saldo de João: " + contaJoao.saldo);

		contaMaria.sacar(1200);
		contaMaria.depositar(100);;
		contaMaria.transferir(200, contaJoao);

		System.out.println("Saldo de Maria: " + contaMaria.saldo);
		System.out.println("Limite disponível de Maria: " + contaMaria.limiteAtual());

		System.out.println("Saldo de João: " + contaJoao.saldo);
}

}

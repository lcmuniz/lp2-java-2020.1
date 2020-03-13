
public class Programa1 {

	public static void main(String[] args) {

		Conta minhaConta;
		Conta outraConta;
		
		Cliente joao = new Cliente();
		joao.nome = "João da Silva";
		joao.cpf = "929939929-22";
		
		minhaConta = new Conta();
		
		minhaConta.titular = joao;
		minhaConta.saldo = 1000;
		
		Cliente maria = new Cliente();
		maria.nome = "Maria Augusta";
		maria.cpf = "847342222-23";

		outraConta = new Conta();
		
		outraConta.titular = maria;
		outraConta.saldo = 200;

		System.out.println("Saldo atual de " + minhaConta.titular.nome + ": " + minhaConta.saldo);
		System.out.println("Saldo atual de " + outraConta.titular.nome + ": " + outraConta.saldo);

		boolean retorno = minhaConta.sacar(400);
		if (retorno) {
			System.out.println("Saque efetuado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		outraConta.depositar(600);
		
		System.out.println("Saldo atual de " + minhaConta.titular.nome + ": " + minhaConta.saldo);
		System.out.println("Saldo atual de " + outraConta.titular.nome + ": " + outraConta.saldo);
		
		boolean ret = minhaConta.transferir(100, outraConta);
		if (!ret) {
			System.out.println("Transferência não foi realizada");
		}

		System.out.println("Saldo atual de " + minhaConta.titular.nome + ": " + minhaConta.saldo);
		System.out.println("Saldo atual de " + outraConta.titular.nome + ": " + outraConta.saldo);
		
	}

}







public class Programa1 {

	public static void main(String[] args) {

		Conta minhaConta;
		Conta outraConta;
		
		minhaConta = new Conta();
		
		minhaConta.titular = "João da Silva";
		minhaConta.saldo = 1000;
		
		outraConta = new Conta();
		
		outraConta.titular = "Maria Augusta";
		outraConta.saldo = 200;

		System.out.println("Saldo atual de " + minhaConta.titular + ": " + minhaConta.saldo);
		System.out.println("Saldo atual de " + outraConta.titular + ": " + outraConta.saldo);

		boolean retorno = minhaConta.sacar(400);
		if (retorno) {
			System.out.println("Saque efetuado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		outraConta.depositar(600);
		
		System.out.println("Saldo atual de " + minhaConta.titular + ": " + minhaConta.saldo);
		System.out.println("Saldo atual de " + outraConta.titular + ": " + outraConta.saldo);
		
		boolean ret = minhaConta.transferir(100, outraConta);
		if (!ret) {
			System.out.println("Transferência não foi realizada");
		}

		System.out.println("Saldo atual de " + minhaConta.titular + ": " + minhaConta.saldo);
		System.out.println("Saldo atual de " + outraConta.titular + ": " + outraConta.saldo);
		
	}

}







public class Conta {

	int numero;
	Cliente dono;
	double saldo;
	
	boolean sacar(double valor) {
		if (saldo - valor < 0) {
			return false;
		}
		else {
			saldo = saldo - valor;
			return true;
		}
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	boolean transferir(double valor, Conta contaDestino) {
		boolean ok = this.sacar(valor);
		if (ok) {			
			contaDestino.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
}

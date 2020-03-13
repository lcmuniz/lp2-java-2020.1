
public class ContaEspecial extends Conta {

	double valorChequeEspecial;
	
	boolean sacar(double valor) {
		if ((saldo + valorChequeEspecial) < valor) {
			return false;
		}
		else {
			saldo = saldo - valor;
			return true;
		}
	}
	
	double limiteAtual() {
		return saldo + valorChequeEspecial; 
	}
	
}

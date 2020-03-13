package entidade;

public class Calculadora {

	private double n1;
	private double n2;
	private char operacao = '+';
	
	public Calculadora() {
		n1 = 0;
		n2 = 0;
		operacao = '+';
	}
	
	public Calculadora(double numero1, double numero2, char op) {
		n1 = numero1;
		n2 = numero2;
		operacao = op;
	}
	
	public Calculadora(char op) {
		n1 = 1;
		n2 = 1;
		operacao = op;
	}

	public void alterarNumero1(double novoNumero) {
		n1 = novoNumero;
	}
	
	public void alterarNumero2(double novoNumero) {
		n2 = novoNumero;
	}
	
	public void alterarOperacao(char novaOperacao) {
		operacao = novaOperacao;
	}
	
	public double resultado() {
		
		switch(operacao) {
		case '+':
			return n1 + n2;
		case '-':
			return n1 - n2;
		case '*':
			return n1 * n2;
		case  '/': 
			return n1 / n2;
		default:
			throw new RuntimeException("Operação '" + operacao + "' não definida.");
		}
	}
	
	public String toString() {
		return n1 + " " + operacao + " " +n2 + " = " + resultado();
	}
	
}

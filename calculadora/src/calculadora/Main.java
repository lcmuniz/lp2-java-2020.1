package calculadora;

import java.util.Scanner;

import entidade.Calculadora;

public class Main {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero = scanner.nextDouble();
		
		calc.alterarNumero1(numero);
		calc.alterarNumero2(33);
		calc.alterarOperacao('/');
		
		double res = calc.resultado();
		System.out.println(res);

		System.out.println(calc); 
		
	}

}

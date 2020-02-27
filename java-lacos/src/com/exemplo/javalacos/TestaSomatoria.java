package com.exemplo.javalacos;

public class TestaSomatoria {

	public static void main(String[] args) {
		
		int contador = 0;
		
		int total = 0;
		while(contador <= 10) {
			total = total + contador;
			contador++;
		}
		
		System.out.print("0 + 1 + 2 + ... + 10 = ");
		System.out.println(total);

	}

}

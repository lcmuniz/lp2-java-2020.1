package com.exemplo.javainstrucoes;

public class TestaBooleans {

	public static void main(String[] args) {
		
		int x = 10;
		int y =  20;

		if (!(x > 20)) {
			System.out.println("Isso vai ser impresso");	
		}
		
		if (x >= 0 && x <= 10) {
			System.out.println("X está entre 0 e 10");
		}
		
		if (x < 0 || x > 10) {
			System.out.println("X não está entre 0 e 10");
		}
		
		if (y == 20) {
			System.out.println("Y é igual a 20");
		}
		
		if (x != 10) {
			System.out.println("X não é igual a 10");
		}
		
		

	}

}

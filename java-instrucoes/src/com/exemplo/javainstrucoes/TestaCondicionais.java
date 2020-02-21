package com.exemplo.javainstrucoes;

public class TestaCondicionais {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		int idade = 14;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
			System.out.println("Bem vindo!");
		}
		else if (quantidadePessoas >= 2) {
			System.out.println("Você está acompanhado. Pode entrar!!");
		}
		else {
			System.out.println("Infelizmente você não pode entrar.");
		}
		
		if (idade >=18 || quantidadePessoas >= 2) {
			System.out.println("Bem vindo");
		}
		else {
			System.out.println("Você não pode entrar");
		}
		
	}

}

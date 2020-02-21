package com.exemplo.javastring;

public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;
		System.out.println(valor);
		
		// tabela unicode: https://unicode-table.com/en/
		char cavalo = 9816;
		System.out.println(cavalo);
		
		String frase = "Faculdade do Maranhão";
		System.out.println(frase);
		
		frase = frase + " - 2020";
		System.out.println(frase);
		
		String titulo = "FACAM";
		titulo = titulo + " - " + 2020;
		System.out.println(titulo);

	}

}

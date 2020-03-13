package com.exemplo.javastring;




public class MetodosString {

	public static void main(String[] args) {
		
		char letras[] = {'F', 'A', 'C', 'A', 'M'};
		
		// cria uma string a partir de um array
		String facam = new String(letras);

		System.out.println(facam);
		
		// procura pelo caractere na posicao (indice)  1
		char letra = facam.charAt(1);
		
		System.out.println(letra);
		
		// verifica se a string comeca com o valor FAC
		boolean comecaComFAC = facam.startsWith("FAC");
		System.out.println(comecaComFAC);
	
		// verifica se a string termina com o valor FAC
		boolean terminaComFAC = facam.endsWith("FAC");
		System.out.println(terminaComFAC);
		
		// cria um array a partir de uma string
		String texto = "Faculdade";
		char cadeia[] = texto.toCharArray();
		
		for(int i = 0; i < cadeia.length; i++) {
			System.out.println(cadeia[i]);
		}
		
		// verifica se uma string é vazia
		System.out.println(facam.isEmpty());
		String s = "";
		System.out.println(s.isEmpty());
		
		String linha = "Amarelo;Verde;Azul";
		String cores[] = linha.split(";");
		
		System.out.println("Cores: ");
		for(int i = 0; i < cores.length; i++) {
			System.out.println(cores[i]);
		}
		
		// retira espaços do inicio e fim da string
		
		String nome = "   João   ";
		System.out.println(nome.trim());
		
		// substrings
		//                            1         2
		//                  012345678901234567890123
		String faculdade = "Faculdade do Estado do Maranhão";
		String inicio = faculdade.substring(0, 9);
		String meio = faculdade.substring(13, 19);
		String fim = faculdade.substring(23);
		System.out.println(inicio);
		System.out.println(meio);
		System.out.println(fim);
		
		// maiusculas e minusculas
		System.out.println(faculdade.toUpperCase());
		System.out.println(faculdade.toLowerCase());
		
		// double -> String
		double meuNumero = 746783.73;
		String minhaString = String.valueOf(meuNumero);
		System.out.println(minhaString);
		
		// formatacao
		double x = 10.0/3;
		System.out.println("10 / 3 = " + x);
		
		String resultado = 
				String.format("10 / 3 = %.2f", x);
		System.out.println(resultado);
		
		System.out.println(String
				.format("AAA - %10s - %010.4f", "João", 1.0));
		
		
	}

}

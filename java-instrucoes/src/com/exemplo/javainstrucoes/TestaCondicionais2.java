package com.exemplo.javainstrucoes;

public class TestaCondicionais2 {

	public static void main(String[] args) {
		
		int mes = 5;

		if(mes == 1) {
			System.out.println("Janeiro");
			System.out.println("Feliz Ano Novo!");
		}
		else if(mes == 2) {
			System.out.println("Fevereiro");
		}
		else if(mes == 3) {
			System.out.println("Março");
		}
		else if(mes == 4) {
			System.out.println("Abril");
		}
		else if(mes == 5) {
			System.out.println("Maio");
		}
		else if(mes == 6) {
			System.out.println("Junho");
		}
		else {
			System.out.println("Fim de ano");
		}
		
		switch(mes) {
		case 1:
			System.out.println("Janeiro");
			System.out.println("Feliz Ano Novo!");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		default:
			System.out.println("Fim do ano");
			break;
		}

	}

}

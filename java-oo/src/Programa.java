




public class Programa {

	public static void main(String[] args) {
		
		int contador = 10;
		contador = 20;
		
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "João da Silva";
		aluno1.idade = 21;
		aluno1.sexo = 'M';
		aluno1.matricula= "AC-2093";
		
		System.out.println(aluno1);
		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.sexo);
		System.out.println(aluno1.matricula);
		
		aluno1.sair();

		System.out.println("--------------------");
		
		Aluno aluno2 = new Aluno();

		aluno2.nome = "Maria Souza";
		aluno2.idade = 21;
		aluno2.sexo = 'F';
		aluno2.matricula= "AC-3434";

		System.out.println(aluno2);
		System.out.println(aluno2.nome);
		System.out.println(aluno2.idade);
		System.out.println(aluno2.sexo);
		System.out.println(aluno2.matricula);

		aluno2.logar();
		aluno2.sair(); 
		
		System.out.println("-----------------_");
		Professor luiz = new Professor();
		luiz.nome = "Luiz Carlos";
		luiz.cpf = "774832932-32";
		luiz.salario = 1000;
		
		System.out.println(luiz);
		System.out.println(luiz.nome);
		System.out.println(luiz.salario);
		
		luiz.baterPonto();
				
	}

}

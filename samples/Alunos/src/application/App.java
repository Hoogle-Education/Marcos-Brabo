package application;

import entities.Aluno;

public class App {

	public static void main(String[] args) {
		
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		
		joao.nome = "Joao da Silva";
		joao.idade = 15;
		joao.media = 7.5;
		joao.altura = 1.7;
	
		System.out.println("Idade = " + joao.idade);
	
		joao.fazerAniversario();
	
		System.out.println("Idade = " + joao.idade);
		
		System.out.println("--------------");
		
		System.out.println("Joao, quanto � 3 + 7 ? " + joao.somar(3, 7));
		
	}

}

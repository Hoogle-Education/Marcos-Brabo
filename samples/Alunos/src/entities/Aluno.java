package entities;

public class Aluno {

	// atributos
	public String nome;
	public int idade;
	public double altura;
	public double media;
	
	// metodos
	public void fazerAniversario() {
		this.idade++;
	}
	
	public int somar(int a, int b) {
		return a + b;
	}

}

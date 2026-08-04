import java.util.Scanner;

public class Aluno {
	
	Scanner leitor = new Scanner(System.in);
	private int nota1;
	private int nota2;
	private int nota3;
	private String nome;
	
	String palavra = leitor.nextLine();
	
	public int getNota1() {
		return nota1;
	}

	public void setNota1(int novoValor) {
		nota1 = novoValor;
	}
	
	public void setNota2(int novoValor) {
		nota2 = novoValor;
	}
	
	public void setNota3(int novoValor) {
		nota3 = novoValor;
	}
	
	public int getNota2() {
		return nota2;
	}

	
	public int getNota3() {
		return nota3;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoValor) {
		nome = novoValor;
	}
	
	public float media() {
		int soma = nota1 + nota2+ nota3;
		return soma/3;
	}
}




import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		Enfermeira enfermeira = new Enfermeira();
		
		System.out.println("Digite seu nome:");
		String nome = ler.nextLine();
		System.out.println("Digite seu sexo:");
		String sexo = ler.nextLine();
		System.out.println("Digite seu peso:");
		float peso = Integer.parseInt(ler.nextLine());
		System.out.println("Digite sua altura:");
		int altura = Integer.parseInt(ler.nextLine());
		System.out.println("Digite sua idade:");
		int idade = Integer.parseInt(ler.nextLine());
		System.out.println("Você fez alguma tatuagem no ultimo ano?");
		String tatuagem = ler.nextLine();
		System.out.println("Ingeriu alcool nas ultimas 12h?");
		String alcool = ler.nextLine();
		
		pessoa.setAltura(altura);
		pessoa.setIdade(idade);
		pessoa.setNome(nome);
		pessoa.setPeso(peso);
		pessoa.setSexo(sexo);

		
		enfermeira.verificarDoador(pessoa, tatuagem, alcool);
		
	}
}

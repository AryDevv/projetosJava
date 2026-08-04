import java.util.Scanner;

public class ExemploScanner {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String  nome = leia.nextLine();
		System.out.println("Oi" + nome);
		System.out.println("Idade");
		int idade = leia.nextInt();
		
		int numero = Integer.parseInt(leia.nextLine());
		
		leia.close();
	}
}

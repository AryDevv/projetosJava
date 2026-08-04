import java.util.Scanner;

public class ExemploScanner3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
//		Integer.parse usado para transformar os tipos
		int anoNascimento = Integer.parseInt(ler.nextLine());
		String nome = ler.nextLine();

		System.out.print(nome + " nasceu em " + anoNascimento);
		
		if (nome.equalsIgnoreCase("ary") == true) {
			System.out.print("Eae man");		
		} else {
			System.out.print("Quem é tu parça?");
		}
	}
}
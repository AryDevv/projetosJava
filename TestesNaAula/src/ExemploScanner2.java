import java.util.Scanner;

public class ExemploScanner2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		int y = ler.nextInt();
		float z = (float) x / y;
		
		System.out.print("O resultado é " + z);
	}
}

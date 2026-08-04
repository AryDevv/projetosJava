import java.util.Arrays;
import java.util.Scanner;

public class media {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("oi");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		 
		/*
		int media = (a + b + c) / 3;
		
		if (media > 7) {
			System.out.print("A média é maior que 7");
		} else if (media < 7) {
			System.out.print("A média é menor que 7");
		} else {
			System.out.print("A média é 7");
		}
		*/
		
		/*
		if (a > b && a > c) {
			if (b > c) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
			}
		}
		if (b > a && b > c) {
			if (a > c) {
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);
			}
		}
		if (c > b && c > a) {
			if (a > b) {
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			} else {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
		}
	
		int[] numbers = {a, b, c};
		Arrays.sort(numbers);

		for (int i = numbers.length - 1; i >= 0; i--) {
		    System.out.println(numbers[i]);
		}
		*/
	}
}

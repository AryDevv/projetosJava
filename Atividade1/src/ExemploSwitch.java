
public class ExemploSwitch {
	public static void main(String[] args) {
		int x = 1;
		
		switch (x) {
			case 0: case 2: case 4: case 6: case 8: case 10:
				System.out.print("x é par");
				break;
			case 1, 3, 5, 7, 9:
				System.out.print("x é impar");
			} 
	}
}

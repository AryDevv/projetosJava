package Classe2;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Carro carro = new Carro();
		Planejador planejador = new Planejador();
		
		System.out.println("Qual o modelo do seu carro? ");
		String modelo = ler.nextLine();
		carro.setModelo(modelo);
		
		System.out.println("Qual a autonomia do seu carro? ");
		float autonomia = ler.nextFloat();
		carro.setAutonomia(autonomia);
		
		System.out.println("Qual a capacidade do seu carro? ");
		int capacidade = ler.nextInt();
		carro.setCapacidade(capacidade);
		
		System.out.println("Qual distancia deseja percorrer? ");
		int distancia = ler.nextInt();
		
		planejador.estimarAbastecimento(carro, distancia);
	}
}

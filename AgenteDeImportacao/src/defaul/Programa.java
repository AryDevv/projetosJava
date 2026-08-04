package defaul;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ProdutoImportado produto = new ProdutoImportado();
		AgenteDeImportacao agente = new AgenteDeImportacao();
		
		System.out.print("Qual tipo de produto voce importou? ");
		String tipo = ler.nextLine();
		produto.setTipo(tipo);
		
		System.out.println("Qual preco em dolar?");
		float preco = ler.nextFloat();
		produto.setPreco(preco);
		
		agente.converter(produto);
		agente.calcularImposto(produto);
	}
	
}

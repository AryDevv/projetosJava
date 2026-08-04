package defaul;

public class AgenteDeImportacao {
	public float converter(ProdutoImportado produto) {
		float reais = produto.getPreco() * 5.13f;
		System.out.println(produto.getPreco() + " convertido para real é " + reais);
		return reais;
		}
	
	public float calcularImposto(ProdutoImportado produto) {
		float imposto = (produto.getPreco() * 5.13f * 60) /100;
		System.out.println("O imposto de produtos do tipo " + produto.getTipo() + " é de " + imposto);
		return imposto;
	}
}


public class Pessoa {
	private String nome;
	private String sexo;
	private float peso;
	private int altura;
	private int idade;
	
	public String getNome()  {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public float getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String novoValor) {
		nome = novoValor;
	}
	public void setSexo(String novoValor) {
		sexo = novoValor;
	}
	public void setPeso(float novoValor) {
		peso = novoValor;
	}
	public void setAltura(int novoValor) {
		altura = novoValor;
	}
	public void setIdade(int novoValor) {
		idade = novoValor;
	}
}
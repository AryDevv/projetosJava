package Classe2;

public class Carro {
	private String modelo;
	private float autonomia;
	private int capacidade;
	
	public String getModelo() {
		return modelo;
	}
	
	public float getAutonomia() {
		return autonomia;
	}

	public int getCapacidade() {
		return capacidade;
	}
	
	public void setModelo(String novoValor) {
		modelo = novoValor;
	}
	
	public void setAutonomia(float novoValor) {
		autonomia = novoValor; 
	}
	
	public void setCapacidade(int novoValor) {
		capacidade =  novoValor;
	}
}

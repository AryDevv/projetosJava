package Classe2;

public class Planejador {
	public int estimarAbastecimento(Carro motorista, int distancia) {
		float qntdAbastecimento = motorista.getCapacidade() * motorista.getAutonomia() / distancia;
		System.out.println("A quantidade de abastecimentos necessários para seu "+ motorista.getModelo() + " são " + qntdAbastecimento);
		return Math.round(qntdAbastecimento);
	}
}

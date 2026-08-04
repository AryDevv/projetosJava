
public class Enfermeira {
	public boolean verificarDoador(Pessoa pessoa, String tatuagem, String alcool) {
		if (pessoa.getIdade() >= 19 && pessoa.getIdade() <= 69) {
			if (pessoa.getPeso() >= 50) {
				if (tatuagem.equalsIgnoreCase("não") == true) {
					if (alcool.equalsIgnoreCase("não") == true) {
						System.out.print("Está apto a ser doador");
						return true;
					}
				}
			}
		}
		return false;
	}
}

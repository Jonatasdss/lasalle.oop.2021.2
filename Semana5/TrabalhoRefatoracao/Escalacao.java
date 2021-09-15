package TrabalhoRefatoracao;

import java.util.ArrayList;

public class Escalacao {

    private String imprimir;

	public Escalacao() {
		this.imprimir="------Segue Escalação-------";
	}
	
	public Escalacao(String imprimir) {
		super();
	
		this.imprimir = imprimir;
	}

	public String getImprimir(ArrayList<Jogador> jogadores) {
		return imprimir;
	}

	public void setImprimir(String jogadores) {
		this.imprimir = jogadores;
	}
}


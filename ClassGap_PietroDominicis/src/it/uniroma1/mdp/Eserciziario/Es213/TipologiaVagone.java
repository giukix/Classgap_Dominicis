package it.uniroma1.mdp.Eserciziario.Es213;

public enum TipologiaVagone {
	
	//FIXME il numero di passeggeri potrebbe essere, una property del costruttore (ad es. una costante statica del costruttore). 
	VAGONEPASSEGERI(50, "VagonePasseggeri"), VAGONELETTO(10, "VagoneLetto"), VAGONEMERCI(0, "VagoneMerci"),
	VAGONELOCOMOTIVA(0, "Locomotiva");

	private int numPass;
	private String tipo;

	TipologiaVagone(int i, String tipo) {
		this.numPass = i;
		this.tipo = tipo;
	}

	//FIXME getNum più correttamente sarebbe getNumPass
	public int getNum() {
		return numPass;
	}

	public String getTipo() {
		return tipo;
	}
}

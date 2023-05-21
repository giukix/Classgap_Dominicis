package it.uniroma1.mdp.Eserciziario.Es213;

public class PasseggeroAssonnato extends Passeggero {
	
	//FIXME standard Java nomenclatura NOME_ASSONNATO per le costanti statiche
	protected static final String nome_assonnato = "Passeggero Assonnato";

	public PasseggeroAssonnato() {
		super(nome_assonnato);

	}

	public String getNome() {
		return nome_assonnato;
	}

}

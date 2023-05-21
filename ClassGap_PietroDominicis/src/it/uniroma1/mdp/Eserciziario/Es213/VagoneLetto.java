package it.uniroma1.mdp.Eserciziario.Es213;

public class VagoneLetto extends Vagone {

	public VagoneLetto(String destinazione) {
		super(destinazione, TipologiaVagone.VAGONELETTO);

	}

	@Override
	public void occupa(Passeggero p) {
		if (p.getNome().equals(PasseggeroAssonnato.nome_assonnato))
			super.occupa(p);
		else
			System.out.println("Passeggero non idoneo");
	}

}

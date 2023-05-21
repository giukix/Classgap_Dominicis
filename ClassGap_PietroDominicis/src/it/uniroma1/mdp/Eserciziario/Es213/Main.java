package it.uniroma1.mdp.Eserciziario.Es213;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Locomotiva locomotiva = new Locomotiva("Roma");
		Vagone vagoneLetto = new VagoneLetto("Roma");
		Vagone vagoneMerci = new VagoneMerci("Roma");
		Vagone vagonePasseggeri = new VagonePasseggeri("Roma");
		Vagone vagoneLetto2 = new VagoneLetto("Roma");
		Vagone vagoneMerci2 = new VagoneMerci("Milano");
		Treno treno = new Treno(locomotiva);
		treno.aggiungiVagone(vagonePasseggeri);
		treno.aggiungiVagone(vagoneLetto);
		treno.aggiungiVagone(vagoneMerci);
		treno.aggiungiVagone(vagoneMerci2);
		System.out.println(treno);
		Passeggero pietro = new PasseggeroAssonnato();
		vagoneLetto.occupa(pietro);
		System.out.println(vagoneLetto.getNumeroPostiDisponibili());
	}

}

package it.uniroma1.mdp.Eserciziario.Es213;

import java.util.*;

public abstract class Vagone {
	private String destinazione;
	private Passeggero[] passeggeri;
	//FIXME tipoVagone contiene già i posti disponibili (refactor?)
	private TipologiaVagone tipoVagone;
	private int postiDisponibili;

	public Vagone(String destinazione, TipologiaVagone tipoVagone) {
		this.destinazione = destinazione;
		this.tipoVagone = tipoVagone;
		passeggeri = new Passeggero[tipoVagone.getNum()];
		this.postiDisponibili = passeggeri.length;

	}

	public int getNumeroPostiDisponibili() {
		return postiDisponibili;
	}

	public void occupa(Passeggero p) {
		if (postiDisponibili > 0) {
			passeggeri[postiDisponibili - 1] = p;
			System.out.println("Passeggero " + p.nome + " registrato");
			postiDisponibili = postiDisponibili - 1;
		}
		// TODO implementare con eccezione se non ci sono più posti disponibili
	}

	public String getDestinazione() {
		return destinazione;
	}

	public String toString() {
		return tipoVagone.getTipo();
	}
}

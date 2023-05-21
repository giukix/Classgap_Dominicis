package it.uniroma1.mdp.Eserciziario.Es213;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Stack;

//FIXME in questa classe ci sono molti "this" superflui
public class Treno {

	private Locomotiva locomotiva;
	private Stack<Vagone> vagoni;
	private String destinazione;

	public Treno(Locomotiva locomotiva) {// , Stack<Vagone> vagoni) {
		this.locomotiva = locomotiva;
		this.vagoni = new Stack<>();
		vagoni.push(locomotiva);
		this.destinazione = locomotiva.getDestinazione();
	}

	//FIXME cosa succede a chi chiama aggiungiVagone con una destinazione errata. Se ne accorge?
	public void aggiungiVagone(Vagone vagone) {
		if (vagone.getDestinazione() != destinazione) {
			System.out.println("Non posso aggiungere il Vagone con destinazione differente");
		} else
			vagoni.push(vagone);
	}

	//FIXME per essere più precisi la pos di dividiTreno dovrebbe chiamarsi k
	public Treno dividiTreno(int pos, Locomotiva locomotiva) {
		//FIXME se differenziamo il nome locale "vagoni" non ci confondiamo e non serve il this
		Stack<Vagone> vagoni = new Stack<>();
		Queue<Vagone> coda = new PriorityQueue<>();
		vagoni.push(locomotiva);
		//FIXME perchè abbiamo usato una coda e non la push direttamente nello stack
		while (this.vagoni.size() > pos) {
			coda.offer(this.vagoni.pop());
		}
		// TODO indicare il caso in cui i vagoni sono meno rispetto alla pos passata in
		// input ECCEZIONI
		coda.forEach(x -> vagoni.push(x));
		coda.clear();
		//FIXME il doppio costruttore in teoria non serve in quanto abbiamo il metodo aggiungiVagone che si può usare sul nuovo treno
		return new Treno(locomotiva, vagoni);
	}

	private Treno(Locomotiva locomotiva, Stack<Vagone> vagoni) {
		this.locomotiva = locomotiva;
		this.vagoni = vagoni;
		this.destinazione = locomotiva.getDestinazione();
	}

	@Override
	public String toString() {
		StringBuilder trenoToString = new StringBuilder();
		this.vagoni.forEach(x -> {
			trenoToString.append(x.toString());
			if (!(vagoni.indexOf(x) == vagoni.size() - 1))
				trenoToString.append("---");
		});
		return trenoToString.toString();
	}

}

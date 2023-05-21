package it.classgap.dominicis;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Streamer {
	
	public Streamer() {
	}
	
	public static void main(String[] args) {
		
		try {
			
			Streamer streamer = new Streamer();			
			
			Set<Ex4Studente> ex4Studentes = streamer.getStudentiSet();
			ex4Studentes.stream().forEach(p -> System.out.println(p.getNomeCognome()));
				
			Map<String, List<Ex4Studente>> mappa2 = streamer.getStudentiSet()
					.stream()
					.collect(Collectors.groupingBy(x -> x.getNomeCognome()
							.substring(x.getNomeCognome().indexOf(" ") + 1, x.getNomeCognome().indexOf(" ") + 2), Collectors.toList()));
			
			Set<String> keyList = mappa2.keySet();
			
			for(String s : keyList) {
				List<Ex4Studente> studs = mappa2.get(s);
				StringBuilder sb = new StringBuilder();
				sb.append("");
				for(Ex4Studente stud: studs) {
					if(sb.length() > 0)
						sb.append(",");
					sb.append(stud.getNomeCognome());
				}
				System.out.println("key="+ s + " list="+sb.toString());
			}
			
			
		} catch (Exception e) {		
			e.printStackTrace();
		}
		
	}
	
	public Set<Ex4Studente> getStudentiSet() {
		Set<Ex4Studente> ex4Studentes = new HashSet<>();
		
		ex4Studentes.add(new Ex4Studente("Bros Mario"));
		ex4Studentes.add(new Ex4Studente("Bros Mariolino"));
		ex4Studentes.add(new Ex4Studente("Princess Peach"));
		ex4Studentes.add(new Ex4Studente("Princess Peachy"));
		
		return ex4Studentes;
	}

}

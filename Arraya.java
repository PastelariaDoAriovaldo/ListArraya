package Backend;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraya {
	public static void main(String [] args) {
		String[] disciplinas = {"Matemáitca", "Filosofia", "História", "Física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("Geografia");
		novaLista.add("Lingua Inglesa");
		
		for (String i: novaLista) 
		{
			System.out.println("Disciplina: " + i);
		}
	}

}

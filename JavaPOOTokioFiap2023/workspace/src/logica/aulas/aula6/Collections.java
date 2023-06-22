package logica.aulas.aula6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Pedro");
		lista.add("João");
		lista.add("Maria");
		lista.add("Marcos");
		lista.add("Anna");
		lista.add("Jose");
		lista.add("Pedro");

		List<Usuario> list = new ArrayList<Usuario>();
		Usuario jose = new Usuario("Jose", "123");
		Usuario maria = new Usuario("Maria", "123");
		Usuario pedro = new Usuario("Pedro", "123");
		list.add(jose);
		list.add(maria);
		list.add(pedro);

		for (String string : lista) {
			System.out.println("Nome: " + string);
			System.out.println("------------");
		}

		for (Usuario usuario : list) {
			System.out.print(usuario.getNome() + "\t");
		}
		
	}
}

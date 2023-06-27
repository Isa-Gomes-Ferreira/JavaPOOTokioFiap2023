package logica.exercicios.aula6.aulaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {

		//Objetos tipo Usuario
		Usuario isabelle = new Usuario(1, "Isabelle", "abc");
		Usuario henrique = new Usuario(2, "Henrique", "abc");
		Usuario felipi = new Usuario(3, "Felipi", "abc");
		Usuario ikram = new Usuario(4, "Ikram", "abc");
		Usuario guilherme = new Usuario(5, "Guilherme", "abc");
		
		//Collection (criando a lista de usuários)
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		//Adicionando objetos Usuario à lista de Usuario
		
		listaUsuarios.add(guilherme);
		listaUsuarios.add(ikram);
		listaUsuarios.add(felipi);
		listaUsuarios.add(henrique);
		listaUsuarios.add(isabelle);
		
		//Iterando a lista (exibindo dados)
		for(Usuario usuario: listaUsuarios) {
			System.out.println("Id: " + usuario.getIdUsuario() + " -- Nome: " + usuario.getNome());
		}
		
		//Ordenando a lista conforme a regra definida no CompareTo
		Collections.sort(listaUsuarios);
		
		System.out.println("-----------------------");
		
		//Iterando a lista ordenada (exibindo dados)
		for(Usuario usuario: listaUsuarios) {
			System.out.println("Id: " + usuario.getIdUsuario() + " -- Nome: " + usuario.getNome());
		}
		
		
		Map mapa = new HashMap();
		
		mapa.put(isabelle, isabelle);
		
		Object objeto = mapa.get(isabelle);
		Usuario usuario = (Usuario) objeto;
		System.out.println(usuario.getNome());
				
	}

}

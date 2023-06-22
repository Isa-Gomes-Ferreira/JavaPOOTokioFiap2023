package logica.aulas.aula6;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Usuario {

	// atributos
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private Date dataCadastro;
	private static List<Usuario> list = new ArrayList<Usuario>();

	// construtor
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		this.dataCadastro = new Date();
	}

	//ITERATOR
	public static List<Usuario> remover(String nome){
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return list;
	}
	
//	listaAtualizada = test.remover("Pedro");
//	for(Usuario user : listaAtualizada) {
//		System.out.println(user.getNome());
//	}
	
	
	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	// "main" + ctrl + space -> gera a main
	public static void main(String[] args) {

		Usuario usuarios[] = new Usuario[2];
		usuarios[0] = new Usuario("Jose", "root");
		usuarios[1] = new Usuario("Maria", "root");

//		for(int i = 0; i < usuarios.length; i++) {
//			System.out.println(usuarios[i].getNome());
//		}

		for (Usuario usuario : usuarios) {
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Data de cadastro: " + usuario.getDataCadastro());
			System.out.println("----------------------------------------------");
		}
		
	}

}

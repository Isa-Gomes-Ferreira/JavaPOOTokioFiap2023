package br.com.fiap.test;

import java.util.List;

import br.com.fiap.model.Usuario;
import br.com.fiap.repository.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {

		// new ConnectionFactory().conectar();

		UsuarioDAO dao = new UsuarioDAO();

		Usuario isabelle = new Usuario("Isabelle", "abc");
		Usuario henrique = new Usuario("Henrique", "abc");
		Usuario felipi = new Usuario("Felipi", "abc");
		Usuario ikram = new Usuario("Ikram", "abc");

//		dao.insert(isabelle);
//		dao.insert(henrique);
//		dao.insert(felipi);
//		dao.insert(ikram);

		List<Usuario> usuarios = dao.selectAll();

		for (Usuario usuario : usuarios) {
			System.out.println("ID: " + usuario.getId());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Data de cadastro: " + usuario.getDataCadastro());
		}

		// SelectAll
//		for (Usuario usuario : usuarios) {
//			System.out.println("ID: " + usuario.getId());
//			System.out.println("Nome: " + usuario.getNome());
//			System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
//		}

		// SelectById
//		//List<Usuario> usuarios = dao.selectAll();
//		System.out.println("----------------------------");
//		Usuario usuario = dao.selectById(1);
//		System.out.println(usuario.getId());
//		System.out.println(usuario.getNome());
//		System.out.println(usuario.getDataCadastro());

		// Delete
//		 //List<Usuario> usuarios = dao.selectAll();
//		
//		 dao.delete(1);
//		 for (Usuario usuario : usuarios) {
//		 System.out.println("ID: " + usuario.getId());
//		 System.out.println("Nome: " + usuario.getNome());
//		 System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
//		 }

//		// Update
//
//		Usuario usuario = dao.selectById(3);
//		usuario.setNome("Felipi Ishida");
//		usuario.setSenha("xyz");
//		dao.update(usuario);

	}

}

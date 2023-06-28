package logica.aulas.aula7.jdbcConnection;

import java.util.List;

public class TesteUsuarioDAO {

	public static void main(String[] args) {

		//new ConnectionFactory().conectar();
		
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
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Data de cadastro: " + usuario.getDataCadastro());
		}
		

		System.out.println("----------------------------");
		Usuario usuario = dao.selectById(1);
		System.out.println(usuario.getId());
		System.out.println(usuario.getNome());
		System.out.println(usuario.getDataCadastro());

	}

}

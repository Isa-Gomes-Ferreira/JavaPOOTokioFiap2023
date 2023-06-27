package logica.aulas.aula7.jdbcConnection;

public class Test {

	public static void main(String[] args) {

		//new ConnectionFactory().conectar();
		
		UsuarioDAO dao = new UsuarioDAO();
		Usuario isabelle = new Usuario(1, "Isabelle", "abc");
		
		dao.insert(isabelle);

	}

}

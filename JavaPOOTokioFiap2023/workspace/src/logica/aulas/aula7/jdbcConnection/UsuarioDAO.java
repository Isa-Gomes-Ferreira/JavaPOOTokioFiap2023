package logica.aulas.aula7.jdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	// CRUD -> create, read, update e delete

	// insert (create)
	public void insert(Usuario usuario) {
		String sql = "insert into usuario (id, nome, senha, dataCadastro) values (?,?,?,?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, usuario.getId());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getSenha());
			stmt.setDate(4, usuario.getDataCadastro());
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// selectAll (read)
	public List<Usuario> selectAll() {

		return null;
	}

	// selectById (read)
	public Usuario selectById(long id) {

		return null;
	}

	// update
	public void update(Usuario usuario) {
		
	}
	
	// delete
	public void delete(long id) {
		
	}
	
}

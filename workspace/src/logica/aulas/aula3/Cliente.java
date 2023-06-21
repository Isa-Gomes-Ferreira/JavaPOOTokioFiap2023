package logica.aulas.aula3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// modelo javabeans (só contém atributo, método construtor e métodos getters e setters)
// serve para fazer a persistência do objeto e tabela do bdd
public class Cliente {

	// Atributos

	private String nomeTitular, cpfTitular, rgTitular, enderecoTitular;
	private final Date dataNasc; //transforma a variável em constante

	// Construtor vazio
	//public Cliente() {
	//}
	
	// Construtor

	public Cliente(String nomeTitular, String cpfTitular, String rgTitular, String enderecoTitular, String dataNasc) throws ParseException {
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.rgTitular = rgTitular;
		this.enderecoTitular = enderecoTitular;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.dataNasc = formato.parse(dataNasc); 
	}

	// Getters / setters

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getRgTitular() {
		return rgTitular;
	}

	public void setRgTitular(String rgTitular) {
		this.rgTitular = rgTitular;
	}

	public String getEnderecoTitular() {
		return enderecoTitular;
	}

	public void setEnderecoTitular(String enderecoTitular) {
		this.enderecoTitular = enderecoTitular;
	}

}

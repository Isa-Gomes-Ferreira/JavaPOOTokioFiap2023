package logica.aulas.aula3;

public class SaldoInsuficiente extends Exception {
	
	public SaldoInsuficiente (String mensagem) {
		super(mensagem);
		//passamos para o construtor da classe mãe
	}
}

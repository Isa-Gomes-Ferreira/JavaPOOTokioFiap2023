package logica.aulas.aula3;

import java.util.Date;
//ctrl + shift + o -> atalho para importar
//ctrl + shift + f -> identa
//ctrl + 3 + (generate constructor || generate getters and setters) -> gerando um método construtor

public abstract class Conta {
	//definimos a classe Conta como abstrata para que a instância da classe seja proibida (não deixa criar objetos com essa classe)

	// Atributos da classe conta
	protected int numeroConta, agencia;
	protected String senha;
	protected Date dataAbertura;
	protected double saldo;
	protected Cliente cliente; // composição
	private static long contador; // está como private porque pertence a superclasse Conta, não pode ser acessa em outras classes // variável estática pertence apenas à classe

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.senha = senha;
		contador++;
	}

	// Métodos
	
	// sacar
	public boolean sacar(double valor) throws SaldoInsuficiente {
		if(valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else
				throw new SaldoInsuficiente("Saldo insuficiente, tente novamente");
		}
		return false;
	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	// consultar
	public abstract void exibirSaldo(); //abstract no método força a reescrita do método na classe filha (subclass)
	
	// transferir
	public void transferir(Conta conta, double valor) throws SaldoInsuficiente {
		boolean teste = this.sacar(valor);
		if (teste == true){
			conta.depositar(valor);
		}
	}
	
	public static void exibirContador() {
		System.out.println("Contas: " + contador);
	}

}

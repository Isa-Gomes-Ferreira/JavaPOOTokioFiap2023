package logica.aulas.aula3;

public class ContaCorrente extends Conta {
// a palavra reservada extends serve para a herança

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, int numeroConta, int agencia, String senha) {
		super(cliente, numeroConta, agencia, senha);
		// super se refere ao construtor da classe mãe (superclass - classe genérica)
	}

	public void resgatar(double valor) {
		if (this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
			this.depositar(valor);
		}
	}

	@Override
	// garante que estamos sobrescrevendo o método na classe filha - e não criando um novo.
	public void exibirSaldo() {
		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Cliente: " + this.cliente.getNomeTitular());
		System.out.println("Data de abertura: " + this.dataAbertura);
		System.out.println("Saldo conta corrente: R$ " + this.saldo);
		System.out.println("Saldo insvestimento: R$ " + this.saldoInvestimento);
		System.out.println("Saldo total: R$" + saldoTotal + "\n");

	}

	// design pattern Strategy
	public void investimento(Produto produto, double valor) {
		boolean teste = this.sacar(valor);
		if(teste == true) {
			this.saldoInvestimento += produto.investir(valor);
		}
	}

}

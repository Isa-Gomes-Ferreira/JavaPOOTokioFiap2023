package logica.aulas.aula3;

import java.util.Date;

public class TesteConta {

	public static void main(String[] args) {

		// Objetos
		Cliente isabelle = new Cliente("Isabelle", "123456789", "123456789", "Rua 123 de Oliveira, 4");
		Cliente henrique = new Cliente("Henrique", "987654321", "987654321", "Rua 321 de Oliveira, 3");
		ContaCorrente contaIsabelle = new ContaCorrente(isabelle, 1, 1, "teste");
		ContaCorrente contaHenrique = new ContaCorrente(henrique, 2, 1, "teste");
		CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();

		// Simulações
		contaIsabelle.depositar(10000);
		contaHenrique.depositar(20000);

		contaIsabelle.exibirSaldo();
		contaHenrique.exibirSaldo();

		contaIsabelle.sacar(5000);
		contaHenrique.sacar(10000);

		contaIsabelle.exibirSaldo();
		contaHenrique.exibirSaldo();

		contaIsabelle.transferir(contaHenrique, 1000);

		contaIsabelle.exibirSaldo();
		contaHenrique.exibirSaldo();

		contaHenrique.transferir(contaIsabelle, 1100);

		contaIsabelle.exibirSaldo();
		contaHenrique.exibirSaldo();

		Conta.exibirContador();
		
		contaIsabelle.investimento(lca, 1000);
		contaIsabelle.exibirSaldo();
		
		contaHenrique.investimento(cdb, 1000);
		contaHenrique.exibirSaldo();
	}

}

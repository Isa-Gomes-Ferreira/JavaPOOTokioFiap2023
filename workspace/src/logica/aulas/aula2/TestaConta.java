package logica.aulas.aula2;

import java.util.Date;

public class TestaConta {

	public static void main(String[] args) {

		// Objetos
		Cliente isabelle = new Cliente("Isabelle", "123456789", "123456789", "Rua 123 de Oliveira, 4");
		Cliente henrique = new Cliente("Henrique", "987654321", "987654321", "Rua 321 de Oliveira, 3");
		Conta contaIsabelle = new Conta(isabelle, 1, 1, "teste");
		Conta contaHenrique = new Conta(henrique, 2, 1, "teste");

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

	}

}

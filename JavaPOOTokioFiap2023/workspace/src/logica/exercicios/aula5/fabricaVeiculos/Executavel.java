package logica.exercicios.aula5.fabricaVeiculos;

public class Executavel {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Alcool alcool = new Alcool();
		Gasolina gasolina = new Gasolina();
		
		
		carro.abastecimento(gasolina, 10);
		carro.abastecimento(alcool, 20);
		carro.abastecimento(gasolina, 10);
		
		System.out.println("Quantidade no tanque: " + carro.getQtdNoTanque());
		System.out.println("Rendimento: " + carro.getRendimentoTotal());
	}
}

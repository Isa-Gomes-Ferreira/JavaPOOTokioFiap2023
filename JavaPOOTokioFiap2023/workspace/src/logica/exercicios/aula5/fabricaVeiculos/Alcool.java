package logica.exercicios.aula5.fabricaVeiculos;


public class Alcool implements Combustivel {

	@Override
	public double abastecer(double qnt) {
		return qnt * 7.5;
	}
		
}
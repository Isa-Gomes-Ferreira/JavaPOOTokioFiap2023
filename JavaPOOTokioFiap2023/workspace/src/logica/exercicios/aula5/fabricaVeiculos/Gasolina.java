package logica.exercicios.aula5.fabricaVeiculos;

public class Gasolina implements Combustivel{

	@Override
	public double abastecer(double qnt) {
		return qnt * 10;
	}

}

package logica.exercicios.aula5.fabricaVeiculos;

// alt + shift + t -> renomear variável

public class Carro {

	private String cor;
	private double velocimetro;
	private boolean estaLigado;
	private double qtdNoTanque;
	private double rendimentoTotal;
	private double combustivel;
	
	public void abastecimento(Combustivel comb, double qtd) {
		if(qtdNoTanque + qtd <= 50) {
			qtdNoTanque += qtd;
			rendimentoTotal += comb.abastecer(qtd);
		}
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocimetro() {
		return velocimetro;
	}

	public void setVelocimetro(double velocimetro) {
		this.velocimetro = velocimetro;
	}

	public boolean isEstaLigado() {
		return estaLigado;
	}

	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}

	public double getQtdNoTanque() {
		return qtdNoTanque;
	}

	public void setQtdNoTanque(double qtdNoTanque) {
		this.qtdNoTanque = qtdNoTanque;
	}

	public double getRendimentoTotal() {
		return rendimentoTotal;
	}

	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoTotal = rendimentoTotal;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

}

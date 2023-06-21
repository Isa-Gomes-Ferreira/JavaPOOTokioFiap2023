package logica.aulas.aula2;

public class CorrecaoFatorial {

	public static void main(String[] args) {

		int fatorial = 1, valor = 6;
		
		for(int i = 1; i <= valor; i++){
			fatorial *= i;
			// fatorial = fatorial * i;
		}

		System.out.println(valor + " ! = " + fatorial);
	}

}

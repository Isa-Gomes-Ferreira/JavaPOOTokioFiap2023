package logica.exercicios.aula6.aulaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
//ctrl + shift + o = faz os importes

public class ArrayListVersusLinkedListPerformance {

	public static void main(String[] args) {
		
		Collection <Long> lista = new LinkedList<Long>();
		
		long inicio = System.currentTimeMillis();
		
		for(long i = 0; i <= 500000; i++) {
			lista.add(i);
		}

		long fim = System.currentTimeMillis();
		
		long tempoGasto = fim - inicio;
		
		System.out.println(tempoGasto);
		
//		Conclusão: o ArrayList performa melhor e consome mais memória, enquanto o LinkedList performa de forma mais lenta e consome menos memória
	}

}

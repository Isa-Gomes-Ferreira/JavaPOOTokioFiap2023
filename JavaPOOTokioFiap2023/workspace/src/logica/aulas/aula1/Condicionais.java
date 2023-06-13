package logica.aulas.aula1;

public class Condicionais {

	public static void main(String[] args) {
		
		//balança dos metais - considerem 3 metais distintos: ouro, 
		//prata e bronze. Escreva um algoritmo para exibir o mais pesado.
		//desafio: não utilizar operadores -> fazer com if else encadeado
		
		float ouro = 20, prata = 30, bronze = 10;
		
		/*
		if(ouro > prata) {
			if(ouro > bronze) {
				System.out.println("O ouro é o metal mais pesado");
			} else {
				System.out.println("O bronze é o metal mais pesado");
			}
		} else if (prata > bronze) {
			if(prata > ouro) {
				System.out.println("A prata é o metal mais pesado");
			} else {
				System.out.println("O bronze é o metal mais pesado");
			}
		}
		*/
		
		//Código refatorado (utilizando operadores):
		
		if(ouro > prata && ouro > bronze) {
				System.out.println("O ouro é o metal mais pesado");
			} else if (prata > bronze){
				System.out.println("A prata é o metal mais pesado");
			} else {
				System.out.println("O bronze é o metal mais pesado");
			}
		}
		
}

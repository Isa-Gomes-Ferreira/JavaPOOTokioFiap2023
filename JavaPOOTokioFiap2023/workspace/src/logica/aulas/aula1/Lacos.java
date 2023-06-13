package logica.aulas.aula1;

import javax.swing.JOptionPane;

public class Lacos {

	public static void main(String[] args) {
	
		int i = 0;
		int resultado = 0;
		
		while (i <= 100) {
			resultado = resultado+i;
			i++;
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}

}
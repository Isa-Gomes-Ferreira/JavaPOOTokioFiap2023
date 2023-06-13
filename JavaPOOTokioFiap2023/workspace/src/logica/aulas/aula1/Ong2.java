package logica.aulas.aula1;

import javax.swing.JOptionPane;

public class Ong2 {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		
		if(idade < 16) {
			JOptionPane.showMessageDialog(null, "Voto e embarque proibidos.");
		}
		if((idade >= 16) && (idade < 18)) {
			JOptionPane.showMessageDialog(null, "Voto opcional.");
		}
		if(idade>=18) {
			JOptionPane.showMessageDialog(null, "Voto obrigatório.");
		}
		
	}

}
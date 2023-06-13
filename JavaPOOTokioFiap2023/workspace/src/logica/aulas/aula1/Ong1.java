package logica.aulas.aula1;

import javax.swing.JOptionPane;

public class Ong1 {

	public static void main(String[] args) {
		
		double doacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da doação: "));
		
		if (doacao < 1000) {
			doacao = ((doacao * 5)/100);
			JOptionPane.showMessageDialog(null, ("Deve-se investir: R$ " + doacao));
		} else {
			doacao = ((doacao * 15)/100);
			JOptionPane.showMessageDialog(null, ("Deve-se investir: R$ " + doacao));
		}
		
	}

}

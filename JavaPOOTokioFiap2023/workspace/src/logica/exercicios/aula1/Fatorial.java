package logica.exercicios.aula1;
import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String args[]) {
    
    int resultado = 1;

    int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado para o fatorial: "));

    for (int i = fatorial; i > 0; i--) {
        resultado = resultado * i;
    }

    JOptionPane.showMessageDialog(null, "O resultado do fatorial de " + fatorial + " é igual a: " + resultado);
    }
}
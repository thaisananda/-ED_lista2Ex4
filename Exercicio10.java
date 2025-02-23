package Exercicios;

import javax.swing.JOptionPane;

import controller.Controller10;

public class Exercicio10 {

	public static void main (String[] args) {
		
		Controller10 binario = new Controller10();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro até 2000:"));
		
		// Validação do limite de entrada
        if (n > 2000 || n < 0) {
            JOptionPane.showMessageDialog(null, "O número deve ser entre 0 e 2000.");
	   }
        
        String resultado = binario.converteBinario(n);
        JOptionPane.showMessageDialog(null, "O número " + n + " em binário é: " + resultado);
    }
        
}



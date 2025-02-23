package controller;

public class Controller10 {
	
	public Controller10() {
		super();
	}

	public String converteBinario(int n) {
		
		// Condição de parada: quando o número for zero, retorna uma string vazia
		if (n == 0) {
			return "";
		} else {
			// Divide por 2 e concatena o resto (n % 2) no final da recursão
            return converteBinario(n / 2) + (n % 2);
		}
	}
}

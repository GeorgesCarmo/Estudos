package ExerciciosLoianeGroner;

import java.util.Scanner;

public class Exercicio3 {
	/* Capture do teclado valores para preenchimento de uma matriz 3x3. Apos a captura imprima a matriz criada e encontre a quantidade de 
	 * números pares e a quantidade de números ímpares*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Instanciando objeto Scanner
		
		int[][] numerosTeclado = new int[3][3]; // Criando matriz
		
		for (int i = 0; i < numerosTeclado.length; i++) {
			for (int j = 0; j < numerosTeclado[i].length; j++) {
				System.out.print("Entre com o valor da posicao ["+i+","+j+"]");
				numerosTeclado[i][j] = scan.nextInt(); // Solicitando do teclado os valores da matriz
			}
		}
		
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < numerosTeclado.length; i++) {
			for (int j = 0; j < numerosTeclado[i].length; j++) {
				if (numerosTeclado[i][j] %2 ==0) { // Condição para descobrir se o numero é par ou impar
					pares ++;
				}else {
					impares ++;
				}
			}
		}
		
		for (int i = 0; i < numerosTeclado.length; i++) {
			for (int j = 0; j < numerosTeclado[i].length; j++) {
				System.out.print(numerosTeclado[i][j] + " "); // Imprimindo a matriz
			}
			System.out.println();
		}
		System.out.println("Pares: "+pares);
		System.out.println("Impares: "+impares);
	}
}


package ExerciciosLoianeGroner;

import java.util.Random;

public class Exercicio2 {
	/*Gere e imprima uma raiz 10x10 com valores aleatórios entre 0-9. 
	  Apos isso indique o maior e menor valor da linha 5 e maior e menor valor da coluna 7*/

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10]; // Criando a Matriz

		Random numerosRandom = new Random(); // Instanciando objeto Random

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numerosRandom.nextInt(99); // Passando valores aleatórios para matriz
			}
		}

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " "); // Imprimindo a matriz
			}
			System.out.println();
		}
		int maiorL5 = 0;
		int menorL5 = 100;
		int linha5 = 5;
		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
			if (numerosAleatorios[linha5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i];
			}
			if (numerosAleatorios[linha5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
			}
		}
		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("Menor valor da linha 5 = " + menorL5);

		int maiorC7 = 0;
		int menorC7 = 100;
		int col7 = 7;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i][col7] > maiorC7) {
				maiorC7 = numerosAleatorios[i][col7];
			}
			if (numerosAleatorios[i][col7] < menorC7) {
				menorC7 = numerosAleatorios[i][col7];
			}
		}
		
		System.out.println("Maior valor da coluna 7 = " + maiorC7);
		System.out.println("menor valor da coluna 7 = " + menorC7);
	}
}
package ExerciciosLoianeGroner;
import java.util.Random;

public class Exercicio1 {
	/*Gere e imprima uma raiz 4x4 com valores aleatórios entre 0-9. Apos isso, determine o maior numero da matriz e a sua posição(linha, coluna).*/

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4]; //Criando a matriz

		Random numerosRandom = new Random(); // instanciando o objeto Random

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numerosRandom.nextInt(99); // Passando os valores aleatórios para a matriz
			}
		}
		// Variáveis
		int maior = 0;
		int linha = 0;
		int col = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if(numerosAleatorios[i][j] > maior) { // O loop vai procurar pelo maior valor
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j]+" "); // Imprimindo a matriz
			}
			System.out.println();
		}
		
		System.out.println("Maior valor = "+maior);
		System.out.println("Linha = "+linha);
		System.out.println("Coluna = "+col);

	}

}

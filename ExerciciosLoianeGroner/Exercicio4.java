package ExerciciosLoianeGroner;

import java.util.Scanner;

public class Exercicio4 {
	/*
	 * Faça um programa para armazenar em uma matriz os compromissos de uma agenda
	 * pessoal. cada dia do mês deve conter 24h podendo associar uma tarefa
	 * específica(compromisso agendado) o programa deve ter um menu onde o usuário
	 * indica o dia do mês que deseja alterar e a hora, entrando em seguida com o
	 * compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o
	 * dia e a hora para obter o compromisso armazenado.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		byte opcao;
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");

			opcao = scan.nextByte();

			if (opcao == 1) { // adicionar compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) { // verifica se o dia é válido
						diaValido = true;
					} else {
						System.out.print("Dia invalido! Digite novamente:");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {// verificando se a hora é válida
						horaValida = true;
					} else {
						System.out.print("Hora invalida! Digite novamente:");
					}
				}

				dia--;
				System.out.println("Digite o compromisso:"); // Inserindo o compromisso
				compromissos[dia][hora] = scan.next();

			} else if (opcao == 2) { // verificar compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mes: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) { // verifica se o dia é válido
						diaValido = true;
					} else {
						System.out.print("Dia invalido! Digite novamente:");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso:");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {// verificando se a hora é válida
						horaValida = true;
					} else {
						System.out.print("Hora invalida! Digite novamente:");
					}
				}

				dia--;
				System.out.println("O compromisso agendado e:");
				System.out.println(compromissos[dia][hora]);
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opcao invalida! Digite novamente: ");
			}
		}
	}

}

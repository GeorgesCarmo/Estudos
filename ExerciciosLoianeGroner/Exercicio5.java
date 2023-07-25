package ExerciciosLoianeGroner;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		String[][][] compromissos = new String[12][31][8];
		
		boolean sair = false;
		byte opcao;
		while(!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if(opcao == 1) { // adicionar compromisso
				
				boolean mesValido = false;
				int mes=0;
				while(!mesValido) {
				System.out.println("Entre com o mes: ");
				mes = scan.nextInt();
				if(mes > 0 && mes <= 12){ // verifica se o mes é válido
					mesValido = true;
				}else {
					System.out.print("Mes invalido! Digite novamente:");
				}
				}
				
				boolean diaValido = false;
				int dia=0;
				while(!diaValido) {
				System.out.println("Entre com o dia do mes: ");
				dia = scan.nextInt();
				if(dia > 0 && dia <= 31){ // verifica se o dia é válido
					diaValido = true;
				}else {
					System.out.print("Dia invalido! Digite novamente:");
				}
				}
				
				
				boolean horaValida = false;
				int hora=0;
				while(!horaValida) {
				System.out.println("Entre com a hora do compromisso:");
				hora = scan.nextInt();
				if(hora>=0 && hora <8){// verificando se a hora é válida
					horaValida = true;
				}else {
					System.out.print("Hora invalida! Digite novamente:");
				}
				}
				
				mes--;
				dia--;
				System.out.println("Digite o compromisso: "); // Inserindo o compromisso
				compromissos[mes][dia][hora] = scan.next();
				
				
				
			}else if(opcao == 2){ // verificar compromisso
				
				boolean mesValido = false;
				int mes=0;
				while(!mesValido) {
				System.out.println("Entre com o mes: ");
				mes = scan.nextInt();
				if(mes > 0 && mes <= 12){ // verifica se o mes é válido
					mesValido = true;
				}else {
					System.out.print("Mes invalido! Digite novamente:");
				}
				}
				
				boolean diaValido = false;
				int dia=0;
				while(!diaValido) {
				System.out.println("Entre com o dia do mes: ");
				dia = scan.nextInt();
				if(dia > 0 && dia <= 31){ // verifica se o dia é válido
					diaValido = true;
				}else {
					System.out.print("Dia invalido! Digite novamente:");
				}
				}
				
				
				boolean horaValida = false;
				int hora=0;
				while(!horaValida) {
				System.out.println("Entre com a hora do compromisso:");
				hora = scan.nextInt();
				if(hora>=0 && hora <= 24){// verificando se a hora é válida
					horaValida = true;
				}else {
					System.out.println("Hora invalida! Digite novamente:");
				}
				}
				
				mes--;
				dia--;
				System.out.println("O compromisso agendado e:");
				System.out.println(compromissos[mes][dia][hora]);
				
				
			}else if(opcao == 0) {
				sair = true;
			}else {
				System.out.println("Opcao invalida! Digite novamente: ");
			}
		}
	}

	}



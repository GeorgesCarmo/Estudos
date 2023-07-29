package ExercicioLoianeGronerException;

import java.util.Scanner;

public class AgendaTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int op = 1;
		while (op != 3) {
			op = obterOpcaoMenu(scan);
			if (op == 1) {
			consultarContato(scan, agenda);
		} else if (op == 2) {
			adicionarContato(scan, agenda);
		}
	}
	}
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		try {
		System.out.println("Criando um contato.");
		String nome = leInfoString(scan, "Entre com o nome: ");
		String telefone = leInfoString(scan, "Entre com o telefone do contato: ");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		System.out.println(contato);
		
		
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}
	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = leInfoString(scan, "Entre com o nome do contato: ");
		try {
			if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existe!");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String leInfoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {
		boolean entradaValida = false;
		int op = 3;
		while (!entradaValida) {
			System.out.println("Digite a opcao desejada");
			System.out.println("1 - Consultar contato");
			System.out.println("2 - Adicionar contato");
			System.out.println("3 - Sair");
			try {
				String entrada = scan.nextLine();
				op = Integer.parseInt(entrada);

				if (op == 1 | op == 2 | op == 3) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada invalida");
				}
			} catch (Exception e) {
				System.out.println("Entrada invalida, digite novamente\n");
			}

		}
		return op;
	}
}
package DevSuperiorInterfaces.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import DevSuperiorInterfaces.entities.Contract;
import DevSuperiorInterfaces.entities.Installment;
import DevSuperiorInterfaces.services.ContractService;
import DevSuperiorInterfaces.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Observe o M em maiúsculo
		
		Locale.setDefault(Locale.US); // tem que estar antes do scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Numero: ");
		Integer number = scan.nextInt();
		System.out.print("Data (dd/mm/aaaa): ");
		Date date = sdf.parse(scan.next());
		System.out.print("Valor do contrato: ");
		Double totalValue = scan.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int N = scan.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processContract(contract, N);
		
		System.out.println("Parcelas: ");
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
		
		
		scan.close();
	}

}

package DevSuperiorExceções;

import java.util.Locale;
import java.util.Scanner;

public class AccountTest {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero:");
		int number = scan.nextInt();
		
		System.out.print("Titular: ");
		scan.nextLine();
		String holder = scan.next();
		
		System.out.print("Saldo inicial: ");
		Double balance = scan.nextDouble();
		
		System.out.println("Limite de saque: ");
		Double withdrawLimit = scan.nextDouble();
		
		Account account = new Account(number, holder,balance,withdrawLimit);
		
		System.out.print("Informe a quantia para saque: ");
		Double amount = scan.nextDouble();
		
		try {
		account.withdraw(amount);
		System.out.println("Novo saldo:" + String.format("%.2f",+account.getBalance()));
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}

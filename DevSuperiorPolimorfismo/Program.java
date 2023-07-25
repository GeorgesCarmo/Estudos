package DevSuperiorPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<TaxPayer>(); // lista generica(TaxPayer) que aceita os outros tipos(Individual e Company)

		System.out.print("Entre com o numero de contribuintes: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " contribuinte:");
			System.out.print("Pessoa Fisica ou pessoa Juridica (f/j)?");
			char type = scan.next().charAt(0);
			System.out.print("Nome: ");
			String name = scan.next(); // aceita somente uma palavra sem espaço
			System.out.print("Renda anual: ");
			double anualIncome = scan.nextDouble();
			if (type == 'f') {
				System.out.print("Gastos com saude:");
				double healthExpenditures = scan.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.println("Numero de funcionarios: ");
				Integer numberOfEmployees = scan.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}

		System.out.println();
		System.out.println("Impostos pagos:");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
		}
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		System.out.println("Total de impostos: $" + String.format("%.2f", sum));
		scan.close();
	}

}

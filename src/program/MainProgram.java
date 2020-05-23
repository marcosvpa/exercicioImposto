package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pessoa.pessoa;
import pessoa.pessoaFisica;
import pessoa.pessoaJuridica;

public class MainProgram {

	public static void main(String[] args) {
		//Settings variables
		double totalTax = 0;
			List <pessoa> pessoaList = new ArrayList<pessoa>();
			Scanner sc = new Scanner(System.in);
		//Main Program
		System.out.print("Enter the number of tax payers: ");
			int taxPayers = sc.nextInt();
			
		for (int j = 1;j <= taxPayers;j++) {
			System.out.println("Tax payer #"+j+" data:");
			System.out.print("Individual or company?(i/c)");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
				switch (type) {
					case 'i':
					System.out.print("Health expenditures");
						double healthExp = sc.nextDouble();
						pessoaList.add(new pessoaFisica(name,anualIncome,healthExp));
						break;
					case 'c':
					System.out.print("Number of employees");
						int employees = sc.nextInt();
						pessoaList.add(new pessoaJuridica(name,anualIncome,employees));
						break;
				}
		}
		
		
		System.out.println("Taxes Paid:");
		for (pessoa pessoas:pessoaList) {
			System.out.printf("%s : $ %f %n %n",pessoas.getName(),pessoas.taxeCal());
			totalTax += pessoas.getTaxToPay();
		}
			System.out.print("Total Taxes: $"+totalTax);
			sc.close();	
	}
}


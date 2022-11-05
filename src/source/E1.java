package source;

import java.util.Locale;
import java.util.Scanner;

import source.entities.Account;
import source.exceptions.BusinessException;

public class E1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, name, balance, withdrawLimit);
			
		
			System.out.print("\nEnter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			
			try {
				acc.withdraw(withdraw);
				System.out.println(acc.toString());
			}
			catch(BusinessException e) {
				System.out.println(e.getMessage());
			}

		sc.close();
	}
}

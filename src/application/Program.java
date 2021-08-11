package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		System.out.print("Date (dd/MM/yyyy): ");
		System.out.print("Contract value: ");
		System.out.print("Enter number of installments: ");
		
		System.out.println("Installments: ");

		sc.close();
	}
}

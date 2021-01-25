package heon_FRB;
import java.util.Scanner;

public class heon_FRBanking {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Key in the initial deposit into Bank-1: RM");
		double deposit = scan.nextDouble();		
		System.out.println("Key in the number of banks to stimulate: ");
		int number = scan.nextInt();
		System.out.println("Simulating for initial deposit of RM" + deposit +" for " + number + "-banks...");
		
		double total =0;
		for (int i = 1 ; i <= number ; i ++) {
			if(i <number) {
			double lend = deposit * 0.90;
			System.out.println("Monery deposited into Bank-"+ i + " = RM" + String.format("%.2f",deposit) + ". Can lend = RM" + String.format("%.2f",lend) );
			deposit = lend ;
			total += lend;}
			else {
				System.out.println("Monery deposited into Bank-"+ i + " = RM" + String.format("%.2f",deposit) + ". Can lend = RM0.00." );
			}
		
		}
		System.out.println("Total amount lent : RM" + String.format("%.2f", total) );

	}

}

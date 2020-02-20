package sample.task;
import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the amount:");
		double amount=sc.nextDouble();
		System.out.println("enter the No.of years:");
		double noOfYears=sc.nextDouble();
		System.out.println("enter the Rate of Interest:");
		double interestRate=sc.nextDouble();
		System.out.println("enter type of interest \n 1)simple_interest\n2)compound_interest\n");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:simple_interest si = new simple_interest(amount,noOfYears,interestRate);
		System.out.println("simple interest=" +si.calculate());
		break;
		case 2:Compound_interest ci = new Compound_interest(amount,noOfYears,interestRate);
		System.out.println("compound interest=" +ci.calculate1());
		break;
		default: System.out.println("enter valid interest type in range 1 or 2");
		break;
		}
	}

}

package sample.task;

public class Compound_interest {
	double amount,noOfYears,interestRate;
	 public Compound_interest(double amount,double noOfYears,double interestRate) {
		 this.amount=amount;
		 this.noOfYears=noOfYears;
		 this.interestRate=interestRate;
	 }
	 public double calculate1() {
		 return amount * Math.pow(1.0+interestRate/100.0, noOfYears) - amount;		 
	 }

}

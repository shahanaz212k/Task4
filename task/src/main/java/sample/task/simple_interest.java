package sample.task;

public class simple_interest {
	double amount,noOfYears,interestRate;
	public simple_interest(double amount,double noOfYears,double interestRate) {
		this.amount=amount;
		this.noOfYears=noOfYears;
		 this.interestRate=interestRate;
	}
	public double calculate() {
		return (amount*noOfYears*interestRate)/100;
	}


}

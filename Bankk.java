package week4day1assign;

public class Bankk extends SBI {
	
	public void ITLoan() {
		System.out.println("ITLoan");
		
	}
	
	public void bankBalance() {
		System.out.println("Available bank balance");
	}
	
	public void maximumLoanAmount() {
		System.out.println("the maximum loan for the customer");
	}
	
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.cibilscore();
		obj.maximumLoanAmount();
		obj.minimumBalance();
		obj.creditScore();
		
		SBI obj1=new Bankk();
		obj1.ITLoan();
		obj1.bankBalance();
		obj1.maximumLoanAmount();
		
	}

}

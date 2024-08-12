package threejava;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
 private double deficit;

 public InsufficientBalanceException(double deficit) {
     super("Insufficient balance, you need more " + deficit + " Rs. to perform this transaction.");
     this.deficit = deficit;
 }

 public double getDeficit() {
     return deficit;
 }
}


public class BankAccount {
	 private double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public void withdraw(double amount) throws InsufficientBalanceException {
	        if (amount > balance) {
	            double deficit = amount - balance;
	            throw new InsufficientBalanceException(deficit);
	        } else {
	            balance -= amount;
	            System.out.println("Transaction successful. Remaining balance: " + balance);
	        }
	    }	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(2000);

        System.out.println("Account balance is: " + account.balance);
        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();

        try {
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }		
	}

}

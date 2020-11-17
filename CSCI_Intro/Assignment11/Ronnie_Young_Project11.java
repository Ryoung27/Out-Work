// Project Eleven Account Classes
// Purpose: The	purpose	for	this project is	to reinforce the knowledge learned in
// Chapter 11.
// Objectives:
// 1. Write	base class and derived classes
// 2. Apply	theory of polymorphism

/*
* @author: Ronnie Young
* @version 11.10.20
*/
import java.util.ArrayList;
public class Ronnie_Young_Project11{
    public static void main(String[] args){
        // Declare an array of Account titled accounts.
        ArrayList<Account> accounts = new ArrayList<>();
        // Create Account, SavingsAccount and Checking Account objects
		Account account = new Account(1122, 20000);

        //Initialize every element in accounts array.
        //Make accounts[0] and accounts[1] be CheckingAccount and accounts[2] and accounts[3] be SavingsAccount
        SavingsAccount savings = new SavingsAccount(01, 20000);
        SavingsAccount savings2 = new SavingsAccount(11, 20000);
        accounts.add(savings);
        accounts.add(savings2);
        CheckingAccount checking = new CheckingAccount(21, 20000);
        CheckingAccount checking2 = new CheckingAccount(20, 20000);
        accounts.add(checking);
        accounts.add(checking2);

        // System.out.println("This is it " + accounts.get(1));
		// Set interest rate of 4.5%
		account.setInterestRate(4.5);
		savings.setInterestRate(4.5);
		checking.setInterestRate(4.5);

        // Make deposit and withdraw for each account and print out the account information see the result.

        //Acount 1 withdraw and deposit
        accounts.get(0).withdraw(2500);
        System.out.println(accounts.get(0).toString());
        accounts.get(0).deposit(3000);
        System.out.println(accounts.get(0).toString());

        //Acount 2 withdraw and deposit
        accounts.get(1).withdraw(2500);
        System.out.println(accounts.get(1).toString());
        accounts.get(1).deposit(3000);
        System.out.println(accounts.get(1).toString());

        //Acount 3 withdraw and deposit
        accounts.get(2).withdraw(2500);
        System.out.println(accounts.get(2).toString());
        accounts.get(2).deposit(3000);
        accounts.get(2).addInterest();
        System.out.println(accounts.get(2).toString());

        //Acount 4 withdraw and deposit
        accounts.get(3).withdraw(2500);
        System.out.println(accounts.get(3).toString());
        accounts.get(3).deposit(3000);
        accounts.get(3).addInterest();
        System.out.println(accounts.get(3).toString());

    }
}

class Account {
	// Data fields
	private int id;
	private double balance;
	private static double InterestRate;

	//Create a default account
	Account() {
		this(0, 0);
	}

    //Create an account
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		InterestRate = 0;
	}



	// set interest rate
    // Set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Return balance
    public double getBalance() {
        return balance;
    }

    // Set id
    public void setId(int id) {
        this.id = id;
    }

    // Return id
    public int getId() {
        return id;
    }

    //Increase balance by deposit amount
    public void deposit(double amount) {
        balance += amount;
    }

    //Decrease balance by withdrawl amount
    public void withdraw(double amount) {
        balance -= amount;
    }

    //Return a string description of account class
    public String toString() {
        return "\nAccount ID: " + id
            + "\nBalance: $" + String.format("%.2f", balance) +
            "\nInterest: $" + String.format("%.2f", getInterestRate());
    }
	public void setInterestRate(double InterestRate) {
        this.InterestRate = (1 + (InterestRate / 100));
	}

	// return interest rate
	public double getInterestRate() {
        return InterestRate;
    }

    public void addInterest()
    {
       double interest = getBalance() * this.InterestRate / 100;
       deposit(interest);
    }
}

class CheckingAccount
	extends Account {
    // Create a default checking account object.
	public CheckingAccount() {
		super();
	}

    //Create a checking account with id and balance.
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}

    //Withdraw amount
	public void withdraw(double amount) {
		if (getBalance() - amount > 0) {
			setBalance(getBalance() - amount);
		}
		else
			return;
	}

    // Return a string of checking account class
	public String toString() {
		return super.toString();
	}
}

class SavingsAccount
	extends Account {

	// Create a default savings account object
	public SavingsAccount() {
		super();
	}

    //Create a savings account with id and balance.
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

    //Verify amount does not break withdrawl rules and withdraw
	public void withdraw(double amount) {
		if (getBalance() - amount > 500 && amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			return;
    }

}
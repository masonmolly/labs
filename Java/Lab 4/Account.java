public class Account {
	
String name; /* variable to hold Account Name, following method arguments must also be String type to set to this variable */
int accountNumber; /* variable to hold Account Number, following method arguments must also be int type to set to this variable */
double Balance; /* variable to hold Account Balance, following method arguments must also be double type to set to this variable */

Account() { /* Exercise doesn't state to include default Account constructor, however I included one as it makes sense to */
	name = "";
	accountNumber = 0;
	Balance = 0.0; /* All variables in default constructor default at 0, or null for 'name', as no input data is yet specified */
}

Account(String s){ /* Account constructor with one argument, name s*/
	name = s; /* name variable is now input argument s*/
	accountNumber = 0;
	Balance = 0.0; /* other variables still at 0 default */
}

Account(String s, int n) { /* Account constructor with two arguments, name s, and accountNumber n*/
	name = s; /* name variable is now input argument s*/
	accountNumber = n; /* accountNumber variable is now input argument n */
	Balance = 0.0; /* Balance variable still at 0 default */
}

Account(String s, double b) { /* Account constructor with two arguments, name s, and Balance b */
	name = s; /* name variable is now input argument s*/
	accountNumber = 0; /* accountNumber variable still at 0 default */
	Balance = b; /* Balance variable is now input argument b */
}

Account(String s, int n, double b) { /* Account constructor with 3 arguments, name s, accountNumber n, and Balance b */
	name = s; /* name variable is now the input argument */
	accountNumber = n; /* accountNumber variable is now input argument n */
	Balance = b; /* Balance variable is now input argument b */
}

void setName(String s) { /* void as to not return a value, merely setting variable value, name variable is set to argument s in setName() method */
	name = s;
}

void setAccountNumber(int n) { /* void as to not return a value, merely setting variable value, accountNumber variable is set to argument n in setAccountNumber() method */
	accountNumber = n;
}

void setBalance(double b) { /* void as to not return a value, merely setting variable value, Balance variable is set to argument b in setBalance() method */
	Balance = b;
}

public String getName() { /* getName() method returns name of account */
	return name;
}

public int getAccountNumber() { /* getAccountNumber() method returns the account number */
	return accountNumber;
}

public double getBalance() { /* getBalance() method returns the balance of the account */
	return Balance;
}

public double deposit(double d) { /* deposit() method allows user to deposit money into their account, added to their current balance, then returns updated balance */
	Balance += d;
	return Balance;
}

public double withdraw(double w) { /* withdraw() method allows users to withdraw money from their account, but only if their balance is the same as, or more than, the amount they want to withdraw, then returns updated balance */
	if (Balance >= w) {
		Balance -= w;
	}
	return Balance;
}

public String toString() { /* toString() method returns account information */
	return "Account [name=" + name + ", accountNumber=" + accountNumber + ", Balance=" + Balance + "]";
}

void printAccount() { /* printAccount() method prints account information */
	System.out.println("Account name = " + name + ", Account number = " + accountNumber + ", Account balance = " + Balance);
}

	public static void main(String[] args) { /* nothing in main method as testing is done in AccountTest.java program */

	}

}


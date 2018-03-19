/* Program to test Account.java */
public class AccountTest {
	public static void main(String[] args) {
		Account account0 = new Account();
		Account account1 = new Account("Molly");
		Account account2 = new Account("Mason", 52028);
		Account account3 = new Account("Likes", 100.50);
		Account account4 = new Account("Money", 200597, 150.50); /* All 'account' variables test different versions of the Account constructors (0-3 arguments)*/
		
		account0.printAccount();
		account1.printAccount();
		account2.printAccount();
		account3.printAccount();
		account4.printAccount(); /* All 'account' variables printed to view different versions of the Account constructors (0-3 arguments) + test printAccount() method */
		System.out.println(account0.toString() + account1.getName() + account2.getAccountNumber() + account3.getBalance() + account4.toString()); /* Tests toString(), getName(), getAccountNumber(), and getBalance() methods, prints to show us results */
		
		account0.setName("Miss");
		account0.setAccountNumber(1111);
		account0.setBalance(50.50);
		System.out.println(account0.toString()); /* account0 variable block testing set() methods, from 0 argument constructor (nothing set) */
		
		account1.setAccountNumber(2468);
		account1.setBalance(250.60);
		System.out.println(account1.toString()); /* account1 variable block testing set() methods, from 1 argument constructor (name set) */
		
		account2.setBalance(300.00);
		System.out.println(account2.toString()); /* account2 variable block testing setBalance() method, from 2 argument constructor (account number and name already set) */
		
		account3.setAccountNumber(1357);
		System.out.println(account3.toString()); /* account0 variable block testing setAccountNumber() method, from 2 argument constructor (balance and name already set) */
		
		account4.deposit(50.50); /* deposit 50.50 to account4 */
		account4.printAccount();
		account4.withdraw(20.50); /* withdraw 20.50 from account4 */
		account4.printAccount();
		account4.withdraw(1000);
		account4.printAccount(); /* account4 variable block testing deposit() and withdraw() methods, from 3 argument constructor. also tests that withdraw() works correctly in not allowing you to withdraw more than is currently in the account (attempts to withdraw 1000 when balance is only 180.5) */
	}

}

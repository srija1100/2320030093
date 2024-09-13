package srija.com;

public class BankingProcessTest {

	public static void main(String[] args) {
		UserLoginManager2 loginManager = UserLoginManager2.getInstance();
        loginManager.logIn(); 
        BankingProcess2 bankingProcess = new BankingProcess2();
        bankingProcess.viewBalance();
        bankingProcess.deposit(500);
        bankingProcess.withdraw(200);
        loginManager.logOut();
        bankingProcess.viewBalance();
        bankingProcess.deposit(100);
        bankingProcess.withdraw(50);
	}

}

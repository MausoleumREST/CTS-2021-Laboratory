package assignment;

public class Testing {

	public static void main(String[] args) throws IllegalLoanValueException {
		BankAccount a = new BankAccount(2000, 2, 3, AccountType.PREMIUM);
		BankAccount[] b = { a };
		System.out.println(a.calculateTotalFee(b));

	}

}

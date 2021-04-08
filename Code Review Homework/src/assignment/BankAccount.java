package assignment;

import exceptions.IllegalLoanValueException;
import interfaces.GetMonthlyRate;

public class BankAccount implements GetMonthlyRate {
	private double loan_value;
	private double rate;
	private int days_active;
	private AccountType account_type;

	public double getLoan() {
		return this.loan_value;
	}

	public double getRate() {
		return this.rate;
	}

	public void setValue(double value) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			this.loan_value = value;
		}
	}

	@Override
	public double getMonthlyRate() {
		return this.loan_value * this.rate;

	}

	@Override
	public String toString() {
		return "Loan: " + this.loan_value + "; Rate: " + this.rate + "; Days active:" + days_active + "; Type: "
				+ account_type + ";";
	}

	public static double calculateTotalFee(BankAccount[] accounts_array) {
		double totalFee = 0.0;
		BankAccount temp_account;
		for (int i = 0; i < accounts_array.length; i++) {
			temp_account = accounts_array[i];
			if (temp_account.account_type == AccountType.PREMIUM
					|| temp_account.account_type == AccountType.SUPER_PREMIUM)
				totalFee += .0125
						* (temp_account.loan_value * Math.pow(temp_account.rate, (temp_account.days_active / 365))
								- temp_account.loan_value);
			// Calculating the monthly interest-principal
			// 1.25% is the broker's fee
		}
		return totalFee;
	}

	public BankAccount(double loan_value, double rate, int days_active, AccountType account_type)
			throws IllegalLoanValueException {
		if (loan_value < 0)
			throw new IllegalLoanValueException(loan_value);
		this.loan_value = loan_value;
		this.rate = rate;
		this.days_active = days_active;
		this.account_type = account_type;
	}

}
package assignment;

public class IllegalLoanValueException extends Exception {
	public IllegalLoanValueException(Double value) {
		super("The loan value can not be negative. \nCurrent loan value is " + value);
	}
}

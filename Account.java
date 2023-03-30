public class Account{
	
	// Private fields
	private double accountValue;

	public Account(){}

	// Setter for accountValue field
	public void setAccountValue(double accountValue){
		if (accountValue > 0){
			this.accountValue += accountValue;
		}
	}

	// Getter for totalValue field
	public double getAccountValue(){
		return this.accountValue;
	}
}

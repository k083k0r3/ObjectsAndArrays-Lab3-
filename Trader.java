// Trader Class
public class Trader{

	private String name;
	private Account account;


	public Trader(String name){
		this.name = name;
		this.account = new Account();
	}


	@Override
	public String toString(){
		return "Trader [" + name + ", " + account.getAccountValue() + "]";
	}


	public void addTrade(Trade trade){
		account.setAccountValue(trade.getTradeValue());
	}
}

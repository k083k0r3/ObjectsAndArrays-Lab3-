// a class representing trades
public class Trade{
	private String ID;
	private String symbol;
	private int quantity;
	private double price;


	public Trade(String ID, String symbol, int quantity, double price){
		this.ID = ID;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
	}

	public Trade(String ID, String symbol, int quantity){
		this(ID, symbol, quantity, 0);
	}
	

	public void setPrice(double newPrice){
		if(newPrice > 0){
			this.price = newPrice;
		}
	}

	public double getTradeValue(){
		return (this.price * this.quantity);
	}

	@Override
	public String toString(){
		return "Trade [" + ID + ", " + symbol + ", " + quantity + ", " + price + "]";
	}
}


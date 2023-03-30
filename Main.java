public class Main{
	public static void main(String[] args){
		Trade trade = new Trade("T1", "AAPL", 100, 15.25);
		Trade trad = new Trade("G2", "GOOGL", 200, 17.20);
		

		Trader trader = new Trader("Kobe Kore");
		trader.addTrade(trad);
		trader.addTrade(trade);
		System.out.println(trader.toString());
	}
}

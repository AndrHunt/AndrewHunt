
public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.50);
        stock.setCurrentPrice(34.35);
        
        
        System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
        System.out.println("Price Change: " + stock.getChangePercent() + "%");
        

    }

}

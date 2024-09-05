import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class shareMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double buyPrice, sellPrice, profit, loss, totalBuy, totalSell, percentProfit, percentLoss;
        int buyQty, sellQty;

        System.out.print("ENTER BUYING PRICE : ");
        buyPrice = sc.nextDouble();

        System.out.print("ENTER NUMBER OF SHARE BUY : ");
        buyQty = sc.nextInt();

        System.out.print("ENTER SELLING PRICE : ");
        sellPrice = sc.nextDouble();

        System.out.print("ENTER NUMBER OF SHARE SELL : ");
        sellQty = sc.nextInt();
		do
		{
			if (sellQty > buyQty) 
			{
				System.out.print("YOU HAVE ONLY " + buyQty + " SHARE(S). PLEASE ENTER A SELL QUANTITY LESS THAN OR EQUAL TO " + buyQty + ": ");
				sellQty = sc.nextInt();
            }
		}
		while (sellQty>buyQty);
        totalBuy = (sellQty < buyQty) ? buyPrice * sellQty : buyPrice * buyQty;
        totalSell = sellPrice * sellQty;
        
        profit = totalSell - totalBuy;
        loss = totalBuy - totalSell;
		
		BigDecimal profitBD = new BigDecimal(profit).setScale(4, RoundingMode.HALF_UP);
        BigDecimal lossBD = new BigDecimal(loss).setScale(4, RoundingMode.HALF_UP);

        percentProfit = (profit / totalBuy) * 100;
        percentLoss = (loss / totalBuy) * 100;

        BigDecimal percentProfitBD = new BigDecimal(percentProfit).setScale(2, RoundingMode.HALF_UP);
        BigDecimal percentLossBD = new BigDecimal(percentLoss).setScale(2, RoundingMode.HALF_UP);

        if (profit >= 0) {
            System.out.println("You got " + percentProfitBD + "% Profit");
            System.out.println("Your profit is " + profitBD + "Rs. :)");
        } else {
            System.out.println("You got " + percentLossBD + "% Loss");
            System.out.println("Your loss is " + lossBD + "Rs. :(");
        }
        
    }
}

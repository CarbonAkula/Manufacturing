import java.util.Scanner;

public class Manufacturing {
    private static double profit;

    public static void main(String[] args) {
        double totalCost, subtotal, profit, itemCost;
        int totalSales, days, numOfItems;
        Scanner keyboard;
        totalCost=calcCost(numOfItems,itemCost);
        totalSales=(days,keyboard);
        profit=profit(totalCost,totalSales);

    }
}
public static double calcCost(int numOfItems, double itemCost) {

    //declare
    double totalCost, subtotal;
    int totalSales, days;
    Scanner keyboard;


    //initializing
    keyboard = new
            Scanner(System.in);

    for (int i = 1; i < numOfItems; i++) {
        System.out.println("How many did you buy of supply item " + i + "?");
        numOfItems = keyboard.nextInt();
        System.out.println("How much per item?");
        itemCost = keyboard.nextDouble();
        subtotal += numOfItems * itemCost;
        totalCost = subtotal;
    }
    return totalCost;
}

public static double profit(double totalCost, int totalSales){
    return profit;
}

    public static void setProfit(double profit) {
        Manufacturing.profit = profit;
    }}
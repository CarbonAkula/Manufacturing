import java.util.Scanner;

public class Manufacturing {
    public static void main(String[] args) {
        double totalCost, subtotal, profit;
        int totalSales, days, numOfItems;
        Scanner keyboard;
        totalCost=calcCost(numOfItems;keyboard);
        totalSales=(days,keyboard);
        profit=profit(totalCost,totalSales);

    }
}
public double calcCost(int numOfItems, double itemCost) {

    //declare
    double totalCost, subtotal;
    int totalSales, days;
    Scanner keyboard;


    //initializing

    for (int i = 1; i < numOfItems; i++) {
        System.out.println("How many did you buy of supply item " + i);
        numOfItems = keyboard.nextInt();
        System.out.println("How much per item ?");
        itemCost = keyboard.nextDouble();
        subtotal = subtotal + (numOfItems * itemCost);
    }
    return totalCost;
}

public double profit(double totalCost, int totalSales);
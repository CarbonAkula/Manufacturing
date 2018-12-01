
    public static class double calcCost(int numOfSuppliesNeeded, Scanner scanner){

        for(int i =1; i <= numOfSuppliesNeeded; i++){
        print.ln(“How many did you buy of supply item ” + i);
        numOfItems = scanner.nextInt();
        print.ln (“How much per item?”);
        cost = scanner.nextDouble();
        total = total + (numOfItems*cost);
        }
        return total;
        }


        import java.util.Scanner;
        main {
        doubleTotalCost;
        Scanner keyboard;
        intItemsNeeded;
        totalCost = calcCost(numOfSuppliesNeeded; keyboard);
        totalSales = method2(days, keyboard);
        profit = profit(totaCost, totalSales);
        }
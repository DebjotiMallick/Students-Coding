import java.util.Scanner;

class ProfitLoss{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double costPrice = scanner.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice = scanner.nextDouble();
        
        if(sellingPrice > costPrice){
            double profit = sellingPrice - costPrice;
            double profitPercent = profit / costPrice * 100;
            System.out.print("Profit percent: " + profitPercent);
        } else if( sellingPrice < costPrice){
            double loss = costPrice - sellingPrice;
            double lossPercent = loss / costPrice * 100;
            System.out.print("Loss percent: " + lossPercent);
        } else {
            System.out.println("No profit no loss");
        }
    }
}
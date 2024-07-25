import java.util.Scanner;
public class MethodOverloading{
    public static void main(String[] args){
        System.out.println("Enter today's earning and expenses");
        Scanner sc = new Scanner(System.in);
        int earning = sc.nextInt();
        int expense= sc.nextInt();
        int saving = todaysSavings(earning, expense);
        System.out.println("saving " + saving);

        System.out.println("get the amount in upi");
        
        double earningUPI = sc.nextDouble();
        double expensesUPI = sc.nextDouble();
        double savingUPI = todaysSavings(earningUPI, expensesUPI);
        System.out.println("savingUPI " + savingUPI);

    }
    private static int todaysSavings(int earning, int expense){
        return(earning- expense);


    }
    private static double todaysSavings(double earningUPI, double expensesUPI){
        return(earningUPI- expensesUPI);
}
}
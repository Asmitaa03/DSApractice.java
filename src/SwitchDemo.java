import java.util.Scanner;
public class SwitchDemo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks as:\n a)10 \n b)50 \n c)80 \n d)90 ");
        int marks= sc.nextInt();
         switch(marks){
            case 10:
            System.out.println("Fail");
            break;
            case 50:
            System.out.println("Pass with D grade");
            break;
            case 80:
            System.out.println("Pass with B grade");
            break;
            case 90:
            System.out.println("Pass with A grade");
            break;

            default:
            System.out.println("Incorrect input!\nKindly choose from the given options.");
         }





    }
}
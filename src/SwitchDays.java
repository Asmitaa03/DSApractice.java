import java.util.*;
public class SwitchDays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days of the week to know your schedule:");
        String days = sc.nextLine();

        switch (days) {
            case "Monday":
            System.out.println("Go to College");
                
                break;
            case "Tuesday":
            System.out.println("Go to College and dance class");
                break;   
            
            case "Wednesday":
            System.out.println("Go to College and complete assignments");
                break;
            case "Thursday":
            System.out.println("Go to gym");
                break;
            case "Friday":
            System.out.println("Go to College and library");
                break;
            case "Saturday":
            System.out.println("Clean the house");
                break;
            case "Sunday":
            System.out.println("Relax");
                 break;
        
            default:
            System.out.println("Incorrect Input!");
                break;
        }

    }
}
import java.util.Scanner;
public class Input{
    public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("My age is: " +age);
        String adult = (age>=18)?"Elligible for voting":"Not elligible for voting";
        System.out.println(adult);
        
 

    }
}

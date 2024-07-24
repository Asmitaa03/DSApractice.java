import java.util.Scanner;
public class StringStatement{
    public static void main(String[] args){
        String name = "Asmita Singh";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("Enter your name");
        Scanner sc= new Scanner(System.in);
        String sname= sc.nextLine();
        if(sname.equals("Asmita Singh")){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Not allowed");
        }
    }

}
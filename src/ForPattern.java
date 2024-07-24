import java.util.Scanner;
public class ForPattern{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){
                System.out.println("* ");
            }
            System.out.println(" ");

        }

    }
}
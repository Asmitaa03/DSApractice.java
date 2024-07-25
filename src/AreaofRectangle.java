import java.util.Scanner;
public class AreaofRectangle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        int b = sc.nextInt();
        int area= l*b;
        System.out.println("Area of Rectangle: "+area);  
    }

private static int areaRectangle(int l, int b){
  return(l*b);
}
}
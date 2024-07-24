public class DoWhileLoopDemo{
    public static void main(String[] args){
        int sum=0;
        int i= 1;
        do{
            System.out.println(i);
            sum+=i;
            i++;
    
        }
        while(i<=10);
        System.out.println("The sum of natural nos. is:"+sum);
        String output= (sum%2==0)?"The sum is even":"The sum is odd";
        System.out.println(output);

    }
}
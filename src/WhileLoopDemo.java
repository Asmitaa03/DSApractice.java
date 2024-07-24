public class WhileLoopDemo{
    public static void main(String[] args){
        int sum =0;
        int i =0;
        while(i<10){
            System.out.println(i);
            i++;
            sum+=i;
        }
        System.out.println("The sum of natural nos. is:"+ sum);
    }
}
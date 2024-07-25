public class SmallestNumberInArray{
    public static void main(String[] args){
        int[] numbers = {1, 7, 3, 9, 11, 24,9};
        int least = numbers[0];

        for(int i = 0; i<numbers.length; i++){
            if(least>numbers[i]){
                least= numbers[i];
            }
        }
        System.out.println("The smallest number in array is: " + least);
    }
}
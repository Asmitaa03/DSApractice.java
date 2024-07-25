public class GreatestNumberInArray{
    public static void main(String[] args){
        int[] numbers = {1, 7, 3, 11, 24, 9};
        int max= numbers[0];
        
        for(int i =0; i<numbers.length; i++){
            if(max < numbers[i]){
                max= numbers[i];
            }
            
        }
        System.out.println("The greatest element in array is: "+ max);


    }
}
public class AverageSumofArray{
    public static void main(String[] args){
        double[] array = {1 , 3, 7, 9, 11, 24, 3};
        double results[] = sumArray(array);
        
        System.out.println("Sum "+ results[0]);
        System.out.println("Average "+ results[1]);
    }
    public static double[] sumArray(double[] array){
        double sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
            
        }
        double average = sum/array.length;

        System.out.println("Average value of array element is " + average);
   
        double results[] = {sum, average};
   
         return results;
   
       }      
   
   
   }
   

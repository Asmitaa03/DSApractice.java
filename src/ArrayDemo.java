public class ArrayDemo{
    public static void main(String[] args){
        String[] friendName = {"Anjali","Shakib","Pratibha","Vishakha","Smarnika"};
        System.out.println(friendName[3]);
        System.out.println(friendName.length);
        friendName[2]= "Ayushi";
        for(int i =0; i<friendName.length;i++){
            System.out.println(friendName[i]+ " is at index "+ i);
        }
        System.out.println("************************************");
        System.out.println("Printing friend's name using for each loop");
        for(String name: friendName){
            System.out.println(name);
        }
    }
}
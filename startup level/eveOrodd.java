//program to find even or odd

public class eveOrodd {
   public static void main(String[] args){

    int num = 30;
    String status = num % 2 == 0? " is even":" is odd"; //here we have used if condition short hand.
    System.out.println(num + status);
   } 
}

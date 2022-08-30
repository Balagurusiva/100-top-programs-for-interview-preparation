//program to find sum of Number in given interval or range 
//here we use three different method remove ther comment and use it

//method 1 - using brute force

public class sumOfNUMs{
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int sum = 0;

        for(int i = a; i<=b; i++)
          sum = sum +i;
        System.out.println("the sum numbers in the range: " +sum);
    }
}

/*
   //method 2 - using formula
   public class sumOfNUMs{
    public static void main(String[] args){
        
        int num1= 2;
        int num2 = 5;
        int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
        System.out.println("the sum number in the range: " +sum);
       }
    }

   //method 3 - using recursion
   

 */
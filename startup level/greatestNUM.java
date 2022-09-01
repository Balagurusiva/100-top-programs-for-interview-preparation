//progrma to fing greatest of two number
//method 1 Using if-else Statements

public class greatestNUM {
    public static void main (String[]args)
    {
 
      int num1 = 50, num2 = 20;
      if (num1 == num2)
        System.out.println ("both are equal");
      else if (num1 > num2)
          System.out.println (num1 + " is greater");
 
      else
          System.out.println (num2 + " is greater");
 
    }
}
/* 
//method 2 Using Ternary Operato
public class greatestNUM {
  public static void main (String[]args)
  {
    int num1 = 50, num2 = 10, temp;

    if (num1 == num2)
      System.out.println ("Both are Equal\n");
    else
      {
	temp = num1 > num2 ? num1 : num2;
	System.out.println (temp + " is largest");
      }

  }
}

//method 3 Using inbuilt max Function
 public class greatestNUM {
     public static void main(String args[])
    {
        int num1 = 12, num2 = 21;
        if (num1 == num2)
            System.out.println("both are equal");
        else
            // prints the maximum of two numbers
            System.out.println(Math.max(num1, num2) + " is greater");
    }
 }

*/
 
 

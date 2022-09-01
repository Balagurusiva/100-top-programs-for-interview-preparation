//program to find the greatest of 3 numbers

//Method 1: Using if-else Statements 2
public class greatest3NUM {
    public static void main (String[]args)
  {

    int num1 = 10, num2 = 20, num3 = 30;

    //checking if num1 is greatest
    if (num1 >= num2 && num1 >= num3)
        System.out.println (num1 + " is the greatest");

    //checking if num2 is greatest
    else if (num2 >= num1 && num2 >= num3)
        System.out.println (num2 + " is the greatest");

    //checking if num2 is greatest
    else if (num3 >= num1 && num3 >= num2)
        System.out.println (num3 + " is the greatest");
  }
    
}

/*
 //Method 2: Using if-else Statements 2
 public class greatest3NUM {
 int num1 = 10, num2 = 20, num3 = 30;

    //comparing num1 with other numbers
    if ((num1 >= num2) && (num1 >= num3))
        System.out.println (num1 + " is the greatest");

    //checking if num2 is greatest
    else if (num2 >= num1 && num2 >= num3)
        System.out.println (num2 + " is the greatest");

    // num3 has to be greatest then if not above
    else
        System.out.println (num3 + " is the greatest");
  }
}

 //Method 3: Using Ternary Operator
 public class greatest3NUM {
    public static void main (String[]args)
  {

    int num1 = 10, num2 = 20, num3 = 30;

     int temp, result;    
    
    // find the largest b/w num1 and num2 & store in temp
    temp = num1>num2 ? num1:num2;
    
    // find the largest b/w temp and num3 & finally printing it
    result = temp>num3 ? temp:num3;  
    System.out.println (result + " is the greatest");
  }
 }
 */

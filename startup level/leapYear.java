//program to find the its is leap or not
//just copy the method and replace the main in the first program to use the different methods


// If the year satisfies either of the conditions, it's considered a leap year -
// 1. The year must be divisible by 400.
// 2. The year must be divisible by 4 but not 100.
//method 1 Using if-else Statements 
public class leapYear {
    public static void main (String[]args)
   {

     int year = 2020;

     if (year % 400 == 0)
       System.out.println (year + " is a Leap Year");

     else if (year % 4 == 0 && year % 100 != 0)
       System.out.println (year + " is a Leap Year");

     else
         System.out.println (year + " is not a Leap Year");

   }
}
/* 
//method 2 if else statement
 public static void main (String[]args)
   {

     int year = 2020;

     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
       System.out.println (year + " is a Leap Year");

     //not leap year
     else
         System.out.println (year + " is not a Leap Year");

   }

method 3 Using Ternary Operator
  public static void main (String[]args)
  {

    int year = 2019;
    
     int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
    if (flag ==1)
    {
        System.out.println (year + " is a Leap Year");
    }
    else
    {
         System.out.println (year + " is not a Leap Year");
    }
  }

//method 4 Bonus Boolean Method

 public static void main(String[] args) {
        int year = 2020;
        boolean leap;

        if (year % 400 == 0)
            leap = true;

        else if (year % 4 == 0 && year % 100 != 0)
            leap = true;

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
*/
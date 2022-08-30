//program to find sum of N natural number
//here we use three different method remove ther comment and use it

//method 1 - using loop
public class sumOfN {
    public static void main(String[] args ){

        int n =10;
        int sum = 0;
         
        for(int i =1; i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

/*
   //method 2 - using formula

   public class sumOfN {
    public static void main(String[] args ){

        int n=10;

        System.out.println(n*(n+1)?2);
    }
  }

  //method 3 - using recursion

  public class sumOfN {
    public static void main(String[] args ){

         int n =10;
         int sum getsum(n);

         System.out.println(sum);
  }

  static int getsum(int n ){
    if(n ==0)
      return n;

    return n+getsum(n-1);
  }
}

 */

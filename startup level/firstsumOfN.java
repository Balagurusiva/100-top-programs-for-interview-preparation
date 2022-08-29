//program to find first sum of N numbers

import java.io.*;
import java.util.*;

public class firstsumOfN {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the n natural numbers");
       int n = scanner.nextInt();

       int sum =0;
       for ( int i=1; i<=n;i++){
        sum = sum + i;
       }
       System.out.println(sum);



    }
}

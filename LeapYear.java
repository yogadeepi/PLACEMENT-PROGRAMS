import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400 ==0){
            System.out.println("Leap year");
        }
         else if(n%100 == 0){
            System.out.println("Not a Leap year");
        }
        else if(n%4 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
        
    }
}

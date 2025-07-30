import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%3 != 0){
            System.out.println("The number is not divisible by 3 and gives a remainder " + n%3 );
        }
        else{
            System.out.println("The number is divisible by 3");
        }
    }
}

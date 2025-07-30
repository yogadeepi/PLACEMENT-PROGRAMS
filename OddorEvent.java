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
        if(n%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");  
        }
    }
}

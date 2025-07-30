import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//ex.6
        int b=sc.nextInt();//ex.5
        for(int i=1;i<=a;i++)
            System.out.println(i + " * " + b + " = " + (i * b));
    }
}

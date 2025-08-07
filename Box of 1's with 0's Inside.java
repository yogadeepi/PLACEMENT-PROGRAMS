import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,r,c;
        n=sc.nextInt();
        for(r=0;r<n;r++){
            for(c=0;c<n;c++){
                if (r == 0 || r == n - 1 || c == 0 || c == n - 1){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}

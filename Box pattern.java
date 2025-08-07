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
        int m1=(n-1)/2;
        int m2=n/2;
        for(r=0;r<n;r++){
            for(c=0;c<n;c++){
                if((r==m1 || r==m2) && (c==m1 ||  c==m2)){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

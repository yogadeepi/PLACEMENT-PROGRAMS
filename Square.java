import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sqrt=(int) Math.sqrt(a);
        if(sqrt*sqrt==a){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not");
        }
    }
}

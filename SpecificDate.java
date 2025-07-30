import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();  // Input format: dd/mm/yyyy
        sc.close();

        String[] parts = date.split("/");
        if (parts.length != 3) {
            System.out.println("Invalid");
            return;
        }

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Check year range
        if (year < 1900 || year > 9999) {
            System.out.println("Invalid");
            return;
        }

        // Check month range
        if (month < 1 || month > 12) {
            System.out.println("Invalid");
            return;
        }

        // Days in each month
        int[] monthDays = {31, 28, 31, 30, 31, 30,
                           31, 31, 30, 31, 30, 31};

        // Leap year check
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            monthDays[1] = 29;
        }

        // Check day range
        if (day >= 1 && day <= monthDays[month - 1]) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

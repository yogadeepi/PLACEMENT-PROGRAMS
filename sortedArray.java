import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int size = sc.nextInt();
            
            if (size <= 0) {
                System.out.println("Array size must be greater than 0");
                return;
            }

            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }

            int max = 0, count = 1, data = a[0];  // assume first element for `data`

            for (int i = 0; i < size - 1; i++) {
                if (a[i] == a[i + 1]) {
                    count++;
                } else {
                    if (max < count) {
                        max = count;
                        data = a[i];
                    }
                    count = 1;
                }
            }

            // Edge case: if last element is the majority
            if (max < count) {
                max = count;
                data = a[size - 1];
            }

            if (max > size / 2) {
                System.out.println("The majority element is : " + data);
            } else {
                System.out.println("No majority element found in the array");
            }

        } 
        catch (NoSuchElementException e) {
            System.out.println("No majority element found in the array");
        } 
        finally {
            sc.close();
        }
    }
}

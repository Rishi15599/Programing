//Write a program to print the value one ary to another array and print the another array

import java.util.Scanner;

public class marge_two_array1 {
    public static int[] arryCopy(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int s = sc.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter input " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        System.out.println("-----------------Array - A");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        int[] b = arryCopy(a);
        System.out.println("-----------------Array - B");
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i] + " ");
        }

    }
}

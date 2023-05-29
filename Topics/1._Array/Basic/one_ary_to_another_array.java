
//Write a program to print the value one ary to another array and print the another array
import java.util.Scanner;

public class one_ary_to_another_array {
    public static void createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array of Size : ");
        int s = sc.nextInt();
        int[] a = new int[s];
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter input " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        System.out.println("---------- Array - A ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println();
        System.out.println("--------  Array - B     ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        createArray();
    }
}

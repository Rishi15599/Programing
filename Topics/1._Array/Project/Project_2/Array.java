package Project_2;

import java.util.Scanner;

public class Array {
    public static void createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array of Size : ");
        int s=sc.nextInt();
        int[] a = new int[s];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter input " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
    }
    public static boolean cheacker(int[] a) {
        if (a.length >= 1) {
            int n1 = a[0];
            int n2 = a[a.length-1];
            if (n1 == n2) {
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
            }
            else{
                return false;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        createArray();
    }
}

//HackerRank Program
package Project_1;

import java.util.Scanner;

public class Project_1 {
    public static int[] breakRecord(int[] a) {
        int countMax = 0;
        int countMin = 0;
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                countMax++;
            }
            if (min > a[i]) {
                min = a[i];
                countMin++;
            }
        }
        int[] b = new int[2];
        b[0] = countMax;
        b[1] = countMin;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of element : ");// 10
        int x = sc.nextInt();
        int[] a = new int[x];// 3,4,21,36,10,28,35,5,24,42
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = breakRecord(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }

}

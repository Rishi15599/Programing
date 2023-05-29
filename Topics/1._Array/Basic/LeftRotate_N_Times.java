import java.util.Scanner;

public class LeftRotate_N_Times {
    public static int[] leftRotateNtimes(int[] a, int count) {
        while (count != 0) {
            int temp = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i-1] = a[i];
            }
            a[a.length - 1] = temp;
            count--;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 5, 8, 6, 4, 9, 2, 3 };
        System.out.println("Before left rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("How many time you want to rotate : ");
        int count = sc.nextInt();
        int[] b = leftRotateNtimes(a, count);
        System.out.println("After right rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

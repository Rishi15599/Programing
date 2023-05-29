import java.util.Scanner;

public class PairsEqualSum {
    public static int[] pairsEqualSum(int[] a, int num) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == num) {
                    System.out.println("(" + a[i] + "," + a[j] + ")");
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No pairs");
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 1, 2, 5, 3, 4, 1 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        pairsEqualSum(a, num);
    }
}

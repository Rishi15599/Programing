
import java.util.Scanner;;

public class LeftRotateWithTab {
    public static int[] leftRotateNtimes(int[] a, int windos) {
        int temp = a[windos - 1];
        for (int i = windos - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = temp;
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
        System.out.print("Please choosc the index number : ");
        int windos = sc.nextInt();
        a = leftRotateNtimes(a, windos);
        System.out.println("After choosc rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

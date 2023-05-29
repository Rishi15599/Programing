
import java.util.Scanner;;

public class RightRotateWithTab {
    public static int[] rightRotateNtimes(int[] a, int windos) {
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
        System.out.println("Before right rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Please choosc the index number : ");
        int windos = sc.nextInt();
        a = rightRotateNtimes(a, windos);
        System.out.println("After choosc rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

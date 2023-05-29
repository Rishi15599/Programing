import java.util.Scanner; 

public class RightRotate_N_Times {
    public static int[] rightRotateNtimes(int[] a, int count) {
        while (count != 0) {
            int temp = a[a.length - 1];
            for (int i = a.length - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = temp;
            count--;
        }
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
        System.out.print("How many time you want to rotate : ");
        int count = sc.nextInt();
        a = rightRotateNtimes(a, count);
        System.out.println("After right rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

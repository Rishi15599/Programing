
public class SmallestElementInArray {
    public static int[] smallestElementInArray(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println();
        System.out.println("min value : " + min);
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 7, 3, 9,-1 };
        System.out.print("My Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        smallestElementInArray(a);
    }
}

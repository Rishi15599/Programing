public class LeftRotate {
    public static void leftRotateArray(int[] a) {
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (i < (a.length - 1)) {
                a[j] = a[i + 1];
                j++;

            }
        }
        a[a.length - 1] = j;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 5, 10, 15, 20 };
        System.out.print("old : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        leftRotateArray(a);
    }
}

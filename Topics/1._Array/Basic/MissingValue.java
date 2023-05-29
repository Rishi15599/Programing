public class MissingValue {
    public static void missingValue(int[] a) {
        int n = a.length + 1;
        int sum1 = ((n) * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum2 += a[i];
        }
        System.out.println("Missing value : "+(sum1 - sum2));
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 6 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        missingValue(a);
    }
}

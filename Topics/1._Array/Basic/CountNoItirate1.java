public class CountNoItirate1 {
    public static void countNoItirate1(int[] a) {
        int[] f = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            f[i] = 1;
            for (int j = i+1; j < a.length; j++) {
                if (a[i] != -1 && a[j] != -1 && a[i] == a[j]) {
                    f[i]++;
                    a[j] = -1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                System.out.println(a[i] + " - " + f[i] + " Times");
            }
        }
        // return a;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6, 4, 3, 2, 2, 3, 4, 4, 5 };
        System.out.print("OLD Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        countNoItirate1(a);
    }
}

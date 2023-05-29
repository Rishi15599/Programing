public class DuplicateElementInArray {
    public static int[] duplicateElementInArray(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] != -1 && a[j] != -1 && a[i] == a[j]) {
                    a[j] = -1;
                    count++;
                }
            }
        }
        int[] b = new int[a.length - count];
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                b[temp] = a[i];
                temp++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("New Array Length : "+b.length);
        return b;
    }

    public static void main(String[] args) {
        int[] a = { 7, 2, 7, 3, 5 };
        System.out.print("OLD Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("OLD Array Length : " + a.length);
        System.out.println("----------------------------------");
        System.out.print("NEW Array : ");
        duplicateElementInArray(a);
    }
}

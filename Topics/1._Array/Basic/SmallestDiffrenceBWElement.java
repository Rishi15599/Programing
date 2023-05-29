public class SmallestDiffrenceBWElement {
    public static void smallestDiffrenceBWElement(int[] a) {
        int temp1 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp1 = a[i];
                    a[i] = a[j];
                    a[j] = temp1;
                }
            }
        }
        System.out.print("After Sorting : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[j] - a[i]) == 1) {
                    System.out.println("Diffrence : " + (a[j] - a[i]));
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 7, 1, 6, 13 };
        smallestDiffrenceBWElement(a);
    }

}

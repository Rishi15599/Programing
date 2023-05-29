public class SortAscending {
    public static int[] sortingAscending(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 3, 6, 4, 1, 8, 0, 5 };
        System.out.println("Original Array : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("NEW Array : ");
        int[] b=sortingAscending(a);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}

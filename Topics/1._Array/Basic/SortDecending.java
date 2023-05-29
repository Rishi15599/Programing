
public class SortDecending {
    public static int[] sortingDecending(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {     
            for (int j = i+1; j < a.length; j++) {     
               if(a[i] < a[j]) {    
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
        System.out.print("OLD Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] b=sortingDecending(a);
        System.out.println("----------------------------");
        System.out.print("NEW Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}

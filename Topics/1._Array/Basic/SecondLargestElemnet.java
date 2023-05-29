
public class SecondLargestElemnet {
    public static void secondLargestElemnet(int[] a) {
        // -------------------------------------------------------------Removing_the_Duplicates
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
        System.out.print("After removing duplicats : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        // ---------------------------------------------------------------Shorting_the_array
        if (b.length > 1) {
            int temp1 = 0;
            for (int i = 0; i < b.length; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (b[i] > b[j]) {
                        temp1 = b[i];
                        b[i] = b[j];
                        b[j] = temp1;
                    }
                }
            }
            // ----------------------------------------------------Find_2nd_Largest_element
            System.out.println();
            for (int i = 0; i < b.length; i++) {
                if (b[i] == a[b.length - 2]) {
                    System.out.print("Second Largest Number : " + b[i]);
                }
            }
        } else {
            System.out.println("All Element are same" + "\nNo any Second element");

        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6, 4, 3, 2, 2, 3, 4, 4, 6, 5, 7 };
        // int[] a={1,1,1,1,1,1,1,1,1,1};
        System.out.print("OLD Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        secondLargestElemnet(a);
    }
}

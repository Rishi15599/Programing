//write a program to print all prime no. in the array and print new array :
public class PrimeNumber {
    public static void primeNo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            int num = a[i];
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && num!=1) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 7, 2, 3, 1, 7, 9, 4 };
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------");
        primeNo(a);
    }
}

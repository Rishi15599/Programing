import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter input "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

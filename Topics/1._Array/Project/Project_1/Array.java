package Project_1;
import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.print("Enter 1 value : ");
        a[0]=sc.nextInt();
        System.out.print("Enter 2 value : ");
        a[1]=sc.nextInt();
        System.out.print("Enter 3 value : ");
        a[2]=sc.nextInt();
        System.out.print("Enter 4 value : ");
        a[3]=sc.nextInt();
        System.out.print("Enter 5 value : ");
        a[4]=sc.nextInt();
        System.out.print("Enter 6 value : ");
        a[5]=sc.nextInt();
        System.out.print("Enter 7 value : ");
        a[6]=sc.nextInt();
        System.out.print("Enter 8 value : ");
        a[7]=sc.nextInt();
        System.out.print("Enter 9 value : ");
        a[8]=sc.nextInt();
        System.out.print("Enter 10 value : ");
        a[9]=sc.nextInt();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
import java.util.Scanner;
public class FactorOfGivinenNumber {
    public static void factor(int number, int[] a){
        for(int i=0;i<a.length;i++){
            if(number%a[i]==0 && a[i]!=number){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={2,5,10,15,20};
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        factor(number,a);
    }
}

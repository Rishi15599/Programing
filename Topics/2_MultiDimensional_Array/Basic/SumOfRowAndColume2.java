
import java.util.Scanner;
public class SumOfRowAndColume2 {
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumOfRow(int[][] a) {
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
            System.out.println("Sum of "+(i+1)+" Row    : "+sum);
            System.out.println("--------------------");
        }
    }
    public static void sumOfColume(int[][] a) {
        for(int i=0;i<a[0].length;i++){
            int sum=0;
            for(int j=0;j<a.length;j++){
                sum=sum+a[j][i];
            }
            System.out.println("Sum of "+(i+1)+" colume   : "+sum);
            System.out.println("--------------------");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. Rows : ");
        int x = sc.nextInt();
        System.out.print("Enter the no. Colum : ");
        int y = sc.nextInt();
        int[][] a = new int[x][y];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the value for " + (i + 1) + " row : ");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        printArray(a);
        sumOfRow(a);
        sumOfColume(a);
    }
}

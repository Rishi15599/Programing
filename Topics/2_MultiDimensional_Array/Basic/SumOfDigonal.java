
import java.util.Scanner;
import java.util.concurrent.Delayed;

class SumOfDigonal {
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void primaryDigonal(int[][] a){
        int sum =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("Sum of Primary diagonal : "+sum);
    }
    public static void secondaryDigonal(int[][] a){
        int sum =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if((i+j)==a.length-1){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("Sum of Secondary diagonal : "+sum);
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
                a[i][j]=sc.nextInt();
            }
        }
        
        printArray(a);
        primaryDigonal(a);
        secondaryDigonal(a);
    }
}

import java.util.Scanner;

class SumOfRowAndColume {
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfRow(int[][] a) {
        // -----------------------------------------------1_Row
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0 || j == a.length) {
                    sum1 += a[i][j];
                }
            }
        }
        System.out.println("Sum of 1st row : " + sum1);
        // ------------------------------------------------2_Row
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 1 || j == a.length) {
                    sum2 += a[i][j];
                }
            }
        }
        System.out.println("Sum of 2nd row : " + sum2);
        // ------------------------------------------------3_Row
        int sum3 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 2 || j == a.length) {
                    sum3 += a[i][j];
                }
            }
        }
        System.out.println("Sum of 3rd row : " + sum3);
    }

    public static void sumOfColum(int[][] a) {
        // -----------------------------------------------1_Colume
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == a.length || j == 0) {
                    sum1 += a[i][j];
                }
            }
        }
        System.out.println("Sum of 1st Colume : " + sum1);
        // ------------------------------------------------2_Colume
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == a.length || j == 1) {
                    sum2 += a[i][j];
                }
            }
        }
        System.out.println("Sum of 2nd Colume : " + sum2);
        // ------------------------------------------------3_Colume
        int sum3 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == a.length || j == 2) {
                    sum3 += a[i][j];
                }
            }
        }
        System.out.println("Sum of 3rd Colume : " + sum3);
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
        sumOfColum(a);
    }
}
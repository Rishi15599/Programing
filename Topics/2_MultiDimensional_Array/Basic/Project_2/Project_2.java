//HackerRank Program
package Project_2;

import java.util.Scanner;

class Result {
    public static int[] icecreamparlar(int m, int[] a) {
        boolean f = false;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (m == a[i] + a[j]) {
                    index1 = i;
                    index2 = j;
                    f = true;
                    break;
                }
            }
            if (f == true) {
                break;
            }
        }
        int[] b=new int[2];
        b[0]=index1+1;
        b[1]=index2+1;
        return b;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int b[]=Result.icecreamparlar(m, a);
            for(int i=0;i<b.length;i++){
                System.out.print(b[i]+ " ");
            }
            System.out.println();
            t--;
        }
    }
}

// input
// 2        - times
// 4        - amount
// 5        - value
// 1 2 3 4 5
// output
// 1 3



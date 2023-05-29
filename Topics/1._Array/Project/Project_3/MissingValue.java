import java.util.Scanner;

class MisssingValue {
    public static void oneMisssingValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size - 1];
        System.out.println("---------------------------------------------");
        System.out.print("Enter The 1st Missing Value : ");
        int MisssingValue1 = sc.nextInt();
        int j = 0;
        for (int i = 1; i <= size; i++) {
            if (i != MisssingValue1) {
                arr[j] = i;
                j++;
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Array Elemnets Are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");
    }

    public static void twoMisssingValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size - 1];
        System.out.println("---------------------------------------------");
        System.out.print("Enter The 1st Missing Value : ");
        int MisssingValue1 = sc.nextInt();
        System.out.print("Enter The 2nd Missing Value : ");
        int MisssingValue2 = sc.nextInt();
        int j = 0;
        for (int i = 1; i <= size; i++) {
            if (i != MisssingValue1 && i != MisssingValue2) {
                arr[j] = i;
                j++;
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Array Elemnets Are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");
    }

    public static void threeMisssingValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.print("Enter the Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size - 1];
        System.out.println("---------------------------------------------");
        System.out.print("Enter The 1st Missing Value : ");
        int MisssingValue1 = sc.nextInt();
        System.out.print("Enter The 2nd Missing Value : ");
        int MisssingValue2 = sc.nextInt();
        System.out.print("Enter The 2nd Missing Value : ");
        int MisssingValue3 = sc.nextInt();
        int j = 0;
        for (int i = 1; i <= size; i++) {
            if (i != MisssingValue1 && i != MisssingValue2 && i != MisssingValue3) {
                arr[j] = i;
                j++;
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Array Elemnets Are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("------------------ Choose -------------------");
            System.out.println("1. One Missing Value");
            System.out.println("2. Two Missing Value");
            System.out.println("3. Three Missing Value");
            System.out.println("4. Exit");
            System.out.print("Please enter the option : ");
            int o = sc.nextInt();
            switch (o) {
                case 1: {
                    oneMisssingValue();
                }
                    break;
                case 2: {
                    twoMisssingValue();
                }
                    break;
                case 3: {
                    threeMisssingValue();
                }
                    break;
                case 4: {
                    System.exit(o);
                }
                    break;
                default: {
                    System.out.println("INVILED INPUT !!!");
                }

            }
        }
    }

}
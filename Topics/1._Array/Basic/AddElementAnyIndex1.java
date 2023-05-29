import java.util.Scanner;
public class AddElementAnyIndex1 {
    public static int[] addElement(int[] a,int num,int index){
        int[] b=new int[a.length+1];
        for(int i=0;i<b.length;i++){
            if(i<=index-1){
                b[i]=a[i];
            }else if(i==index){
                b[i]=num;
            }else{
                b[i]=a[i-1];
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8};
        System.out.print("OLD Array : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print("Enter the index : ");
        int index=sc.nextInt();
        if(index<a.length){
            int[] b=addElement(a, num, index);
            System.out.print("NEW Array : ");
            for(int i=0;i<b.length;i++){
                System.out.print(b[i]+" ");
            }
        }else{
            System.out.println("Not Possible");
            System.out.println(a.length);
        }
    }
}

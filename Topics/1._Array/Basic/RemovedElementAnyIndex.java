import java.util.Scanner;
public class RemovedElementAnyIndex {
    public static int[] removedElementAnyIndex(int[] a,int index){
        int[] b=new int[a.length-1];
        for(int i=0; i<b.length;i++){
            if(i<=index-1){
                b[i]=a[i];
            }else{
                b[i]=a[i+1];
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={2,4,7,1,9,6,3};
        System.out.print("OLD Array : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the index : ");
        int index=sc.nextInt();
        if(index<a.length){
            int[] b=removedElementAnyIndex(a, index);
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

// Write a program to marge two array 
public class marge_two_array {
    public static void margeTwoArray(){
        int z=0;
        int[] a={1,2,3,4};
        int[] b={5,6,7,8};
        int[] c=new int[(a.length+b.length)];
        for(int i=0;i<(a.length);i++,z++){
            c[z]=a[i];
        }
        for(int i=0;i<(b.length);i++,z++){
            c[z]=b[i];
        }
        System.out.println("----------------new Array");
        for(int i=0;i<(a.length+b.length);i++){
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        margeTwoArray();
    }
}

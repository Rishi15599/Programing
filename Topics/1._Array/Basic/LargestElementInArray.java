public class LargestElementInArray {
    public static int[] largestElementInArray(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println();
        System.out.println("max value : "+max);
        return a;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,7,3,9};
        System.out.print("My Array : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        largestElementInArray(a);
    }
}

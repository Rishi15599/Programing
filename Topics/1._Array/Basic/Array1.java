//Create array and give the vale and print the final array
class Array {
    public static void main(String[] args) {
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println();
        a[0]=10;
        a[3]=60;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
}
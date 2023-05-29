//write a program to add an element in array at specific index ?
import java.util.Scanner;;
public class AddElementAnyIndex {
    public static int[] addElement(int n, int arr[],int x,int pos){
        int i;
        int newarr[]=new int[n+1];
        for(i=0;i<n+1;i++){
            if(i<pos-1){
                newarr[i]=arr[i];
            }else if(i== pos-1){
                newarr[i]=x;
            }else{
                newarr[i]=arr[i-1];
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        
    }
}

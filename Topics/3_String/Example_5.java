import java.util.Scanner;
class Example_5{
    public static char[] toCharArray(String s){
        char[] c=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        return c;
    }
    public static char[] ascendingString(char[] c){
        // int temp = 0;
        for (int i = 0; i < c.length-1; i++) {
            for (int j = i + 1; j < c.length-1; j++) {
                if(c[j-1]>c[j]){
                    char temp=c[j-1];
                    c[j-1]=c[j];
                    c[j]=temp;
                }
            }
        }
        return c;
    }
    public static boolean equals(char[] c1,char[] c2){
        boolean f=true;
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[j]){
                f=false;
                break;
            }
        }
        if(f==false){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Word : ");
        String string1=sc.next();
        System.out.print("Enter 2st Word : ");
        String string2=sc.next();
        if(string1.length()==string2.length()){
            toCharArray(string1);
            toCharArray(string2);
            System.out.println(ascendingString(null));
            System.out.println(equals(null, null));
        }
        else{
            System.out.println("It is not a aragram");
        }
    }
}
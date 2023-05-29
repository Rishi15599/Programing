
class A{
    public String m1(){
        System.out.println("mi Method");
        String s="qwertyuiop";
        System.out.println(s);
        return s;
    }
    public String m2(){
        System.out.println("mi Method");
        String s="qwertyuiop";
        System.out.println(s);
        return s;
    }
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        System.out.println(a.m1()==a1.m2());
    }
}
import jdk.dynalink.beans.StaticClass;

public class methode_overloading { //we  can call the same methode many times with same name.
    static void foo(){
        System.out.println("what is your name");
    }static void foo(int a){
        System.out.println("what is your name" +" "+ a);
    }static void foo(int a, int b){
        System.out.println("what is your name: " + a + " " +b);
    }
    public static void main(String[] args) {
       foo();
       foo(300);
       foo(310,125);
    }
}

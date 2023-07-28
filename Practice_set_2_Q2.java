import java.util.Scanner;
public class Practice_set_2_Q2 {
    public static void main(String[] args) {
        System.out.println("enter your value: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if (a>=10){
            System.out.println("your enter value is grater than system value ");
        }
        else {
            System.out.println("not the biggest value");
        }
    }
}

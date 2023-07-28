import java.util.Scanner;
public class Practice_set_2_Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the value of v :");
        Scanner sc=new Scanner(System.in);
        int v= sc.nextInt();
        System.out.println("Enter the value of u :");
        int u= sc.nextInt();
        System.out.println("Enter the value of a :");
        int a= sc.nextInt();
        System.out.println("Enter the value of s :");
        int s= sc.nextInt();
        int w=((v*v) -(u*u))/(2*a*s);
        System.out.println(w);
    }
}

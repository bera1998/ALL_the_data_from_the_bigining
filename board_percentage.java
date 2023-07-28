import java.util.Scanner;
public class board_percentage {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("English");
        float a= sc.nextFloat();
        System.out.println("Math");
        float b= sc.nextFloat();
        System.out.println("History");
        float c= sc.nextFloat();
        System.out.println("Geography");
        float d= sc.nextFloat();
        float e=((a+b+c+d)/5)*100;
        System.out.println("percentage of the student:"+e);
    }
}

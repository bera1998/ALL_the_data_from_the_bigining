
        //Question 2
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Practice_set_4 {
    public static void main(String[] args) {
//        System.out.println("Enter your 3 sub number.");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Math:");
//        float Math=sc.nextInt();
//        System.out.println("Phy:");
//        float Phy=sc.nextInt();
//        System.out.println("Chm:");
//        float Chm=sc.nextInt();
//        float avg=((Math+Phy+Chm)/3);
//        System.out.println("your over all percentage "+ avg);
//        if (avg<=40 || Math<=33 || Phy<=33 || Chm<=33){
//            System.out.println("you are fail");
//        }
//
//        else {
//            System.out.println("you pass the exam");
//

        //`Question3

//        System.out.println("Enter the no code of day");
//        Scanner sc = new Scanner(System.in);
//        float income = sc.nextFloat();
//        float tax = 0;
//        if (income <= 2.5f) {
//            System.out.println("You don't have to pay any tax ");
//        } else if (income > 2.5f && income <= 5f) {
//            tax= (tax+0.05f*(income-2.5f));
//        } else if (income>5 && income<=10) {
//            tax= (float) (tax+0.05*(income-2.5));
//            tax=(float) (tax+0.1*(5-2.5));
//        } else if (income>10) {
//            tax= (float) (tax+0.05*(income-2.5));
//            tax=(float) (tax+0.1*(5-2.5));
//            tax=(float) (tax+0.2*(10-2.5));
//        }
//        System.out.println("total tax paid by the employee " +tax );

        //Question 4
//        int day=sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 0 -> System.out.println("Sunday");
//        }
                    //QUESTION 5
//        System.out.println("Enter the Year what u wants to know");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if (n % 4==0 || n % 100==0){
//            System.out.println("Year Entered by you is leap year");
//        }
//        else {
//            System.out.println("this is not a leap year");
//        }

                //Question 6
        System.out.println("Enter your website");
        Scanner sc=new Scanner(System.in);
        String wbsite=sc.next();
        if(wbsite.endsWith(".com")){
            System.out.println("this ia a commercial website ");
        } else if (wbsite.endsWith(".org")) {
            System.out.println("this ia an organization website");
        } else if (wbsite.endsWith(".in")) {
            System.out.println("this ia an Indian website");
        }
        else {
            System.out.println("This is an other website ");
        }

    }
}
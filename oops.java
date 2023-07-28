public class oops {
    public static void main(String[] args) {
//        student student1 = new student();
        student student2=new student( 19,"nitish",98  );
//        student1.roll = 11;
//        student1.marks = 75.05f;
//        student1.name = "Souvik";
//        student1.gretting();
//        System.out.println(student1.roll);
//        System.out.println(student1.name);
//        System.out.println(student1.marks);
        System.out.println(student2.roll);
        System.out.println(student2.name);
        System.out.println(student2.marks);

    }
    }
class student{
    int roll;
    String name;
    float marks;
//    void gretting(){
//        System.out.println("hellow! tell me the name "+ name);
//    }
//    student() { //Here we use constructor as a function but in constructor we do not have to make a return type because
        // constructor always return the value to the class.
//        this.name = "souvik";
        //Here we use 'this' for the reference variable. here in this question this means, nothing but student1
//        this.roll = 15;
//        this.marks = 78.99f;
//    }
        student(int roll,String name,float marks){
            this.roll=roll;
            this.name=name;
            this.marks=marks;
    }
}

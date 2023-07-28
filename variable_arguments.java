public class variable_arguments {
    static int sum(int...arry){
        int total=0  ;
        for (int a: arry) {
            total=total + a;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("the sum of 4,5,7and 9: " +sum( 4,5,7,9));
    }
}

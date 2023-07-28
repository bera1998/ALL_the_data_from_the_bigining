import java.util.Locale;

public class string {
    public static void main(String[] args) {
        String name="souvik";
        System.out.println(name);
        int value=name.length();
        System.out.println(value);
        String upper_case=name.toUpperCase();
        System.out.println(upper_case);
        String lower_case = name.toLowerCase();
        System.out.println(lower_case);
        String nontrimstring="   Dip  ";
        String trimpstring=nontrimstring.trim();
        System.out.println(trimpstring);
        System.out.println(name.substring(2,4));
        System.out.println(name.length());
        System.out.println(name.replace("vik","ndr"));
    }
}

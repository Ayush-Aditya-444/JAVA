import java.text.NumberFormat;

public class Formating_Numbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String a = currency.format(12345667.9876);
        System.out.println(a);
    }
    
}

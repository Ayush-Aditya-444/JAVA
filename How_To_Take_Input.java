import java.util.Scanner;

public class How_To_Take_Input {
    private static Scanner a,b,c,d,e;
    public static void main(String[] args) {
        a = new Scanner(System.in);
        System.out.print("Taking Input (Byte) = ");
        byte z = a.nextByte();
        System.out.println("Your Byte Value = "+z);
        b = new Scanner(System.in);
        System.out.print("Taking Value (Integer) = ");
        int y = b.nextInt();
        System.out.println("Your Integer Value = "+y);
        c = new Scanner(System.in);
        System.out.print("Your String = ");
        String x = c.next();
        System.out.println("Your String First Word = "+x);
        d = new Scanner(System.in);
        System.out.print("Taking Input (Double)");
        Double w = d.nextDouble();
        System.out.println("Your Double Value = "+w);
        e = new Scanner(System.in);
        System.out.print("Your String = ");
        String f = e.nextLine().trim();
        System.out.println("Your String Full Line = "+f);

    }
    
}

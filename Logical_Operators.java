public class Logical_Operators {
    public static void main(String[] args) {
        int a = 22;
        boolean b = a > 20 && a < 30;
        boolean c = a > 24 && a < 30;
        boolean d = a > 20 || a < 30;
        boolean e = a > 24 || a > 30;
        boolean f = d && e;
        boolean g = d || e;
        System.out.println("Your Tea Teampertaure Is "+b+ " Degree Celcius");
        System.out.println(c);
        System.out.println("D Value "+d);
        System.out.println("E Value "+e);
        System.out.println(f);
        System.out.println(g);
    }
    
}

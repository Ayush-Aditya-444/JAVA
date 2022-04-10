public class Arithmetic_Expression{
    public static void main(String[] args) {
        int a = 10 , b = 20;
        int result1 = b/a;
        int result2 = a/b;
        double result3 = b/a;
        double result4 = (double)a/b;
        System.out.println("int(b/a) = "+result1);
        System.out.println("int(a/b) = "+result2);
        System.out.println("double(b/a) = "+result3);
        System.out.println("double(a/b) = "+result4);

        //Incremeant
        int c = 1;
        int d = c++;
        int e = ++c;
        int f = c--;
        int g = --c;

        System.out.println("Value Of C = "+c);
        System.out.println("Value Of D = "+d);
        System.out.println("Value Of E = "+e);
        System.out.println("Value Of C = "+c);
        System.out.println("Value Of F = "+f);
        System.out.println("Value Of C = "+c);
        System.out.println("Value Of G = "+g);
        System.out.println("Value Of C = "+c);
        
    }
}
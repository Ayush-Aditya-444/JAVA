import java.util.Scanner;

public class Fizz_Buzz {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%5==0 && a%3==0){
            System.out.println("FizzBuzz");
        }
        else if (a%5==0){
            System.out.println("Fizz");
        }
        else if (a%3==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(a);
        }
    }
    
}

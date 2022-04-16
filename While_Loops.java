import java.util.Scanner;

public class While_Loops {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String a = "";
        while (!a.equals("quit")){
            System.out.print("Input : ");
            a = sc.nextLine().toLowerCase();
            System.out.println(a);
        }
    }
    
}

import java.util.Scanner;

public class If_Statements {
    private static Scanner sc;
    public static void main(String[] args) {
    sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a>30){
        System.out.println("Today's Temperature Is "+a);
        System.out.println("It's A Hot Day.");
        System.out.println("Drink Pleanty Of Water");
    }
    else if (a<=30 && a>=20){
        System.out.println("Today's Temperature Is "+a);
        System.out.println("Today Is A Good Weather");
    }
    else {
        System.out.println("Today's Temperature Is "+a);
        System.out.println("It Is Cold Outside");
        System.out.println("Stay At Home");
    }
}    
}

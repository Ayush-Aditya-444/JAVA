import java.util.Scanner;

public class Switch_Operator {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch (a) {
            case "Admin":
                System.out.println("You're An Admin");
                break;
            case "Moderator":
                System.out.println("You're A Moderator");
                break;
            default:
                System.out.println("You're Nothing.");
                break;
        }
    }
}

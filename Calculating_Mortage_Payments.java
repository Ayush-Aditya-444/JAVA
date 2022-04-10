import java.util.Scanner;

public class Calculating_Mortage_Payments {
    private static Scanner principle,rate,time,name;
    public static void main(String[] args) {
        name = new Scanner(System.in);
        System.out.print("Your Full Name:- ");
        String full_name = name.nextLine();
        principle = new Scanner(System.in);
        System.out.print("Your Amount:- ");
        int Amount = principle.nextInt();
        rate = new Scanner(System.in);
        System.out.print("Your Rate Of Interest:- ");
        double Rate = rate.nextDouble();
        time = new Scanner(System.in);
        System.out.print("Your Time Of The Loan:- ");
        int Time = time.nextInt();
        double mortage = (Amount*(Rate*(Math.pow(1+Rate, (Time*12)))))/(Math.pow(1+Rate, (Time*12))-1);


        System.out.println("");
        System.out.println("");
        System.out.println("Your Name:- "+full_name);
        System.out.println("Your Amount:- "+Amount);
        System.out.println("Your Rate Of Interest:- "+Rate);
        System.out.println("Your Time Of The Loan:- "+Time);
        System.out.println("Your Mortage Value = "+mortage);
        
    }
    
}

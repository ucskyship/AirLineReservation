import data.models.EconomyClass;
import data.models.FirstClass;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static EconomyClass economyClass = new EconomyClass();
    static FirstClass firstClass = new FirstClass();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        bookingMenu();
    }

    private static void bookingMenu() {
        System.out.println("""
                        AIRLINE RESERVATION
                                
                1. For firstClass
                2. For economyClass
                                
                0. Cancel
                """);

        int response = input.nextInt();
        switch (response) {
            case 1 -> firstClass();

            case 2 -> economyClass();

            case 0 -> System.out.println("Thank You FOr Your Response");
        }
    }

    private static void economyClass() {
        System.out.println("""
                This Is For Economy-Class Registration -
                """);
        System.out.println("enter name");
        String name = input.next();
        System.out.println("enter your phone number");
        String phone = input.next();
        String result = economyClass.assignSeat(name, phone);

        System.out.println(result);
        if (result.equals("full")) {
            System.out.println("""
                    Do you want to make a first class booking?
                                        
                    y/n
                    """);
            String response = input.next();

            if (Objects.equals(response, "y")) {
                firstClass();
            } else System.out.println("Next flight leaves in 3hours");
        }
    }

    private static void firstClass() {
        System.out.println("""
                This Is For First-Class Booking -
                """);
        System.out.println("enter your name");
        String name = input.next();
        System.out.println("enter your phone number");
        String phone = input.next();

        String result = firstClass.assignSeat(name, phone);

        System.out.println(result);

        if (result.equals("no available seat")) {
            System.out.println("""
                                        
                    Do you want to make a second class booking?
                                        
                    y/n
                    """);
            String response = input.next();
            if (Objects.equals(response, "y")) {
                economyClass();
            } else System.out.println("Next flight leaves in 3hours");
        }

        System.out.println("""
                                
                Do You Still Want To Make Another Booking?
                                
                y/n
                """);
        String response = input.next();
        switch (response) {
            case "y" -> bookingMenu();
            case "n" -> {
                break;
            }
        }
    }
}

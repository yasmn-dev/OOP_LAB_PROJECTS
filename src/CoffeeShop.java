import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Coffee Shop Menu:");
        System.out.println("Enter A for Americano");
        System.out.println("Enter C for Cappuccino");
        System.out.println("Enter L for Latte");
        System.out.println("Enter E for Espresso");
        System.out.print("Enter your choice: ");

        String temp = scan.next();
        char choice = temp.charAt(0);

        switch (choice) {
            case 'A':
                System.out.println("Cost of Americano: $3.00");
                break;
            case 'C':
                System.out.println("Cost of Cappuccino: $3.75");
                break;
            case 'L':
                System.out.println("Cost of Latte: $4.00");
                break;
            case 'E':
                System.out.println("Cost of Espresso: $2.50");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid menu item.");
        }
    }
}

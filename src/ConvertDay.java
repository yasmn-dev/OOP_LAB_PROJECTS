import java.util.Scanner;

public class ConvertDay {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int num = scan.nextInt();

        if (num == 1) {
            System.out.println("Day: Monday");
        } else if (num == 2) {
            System.out.println("Day: Tuesday");
        } else if (num == 3) {
            System.out.println("Day: Wednesday");
        } else if (num == 4){
            System.out.println("Day: Thursday");
        }else if (num == 5) {
            System.out.println("Day: Friday");
        }else if (num == 6) {
            System.out.println("Day: Saturday");
        }else if (num == 7) {
            System.out.println("Day: Sunday");
        }else {
            System.out.println("Invalid value! Please enter 1–7.");
        }
    }
}

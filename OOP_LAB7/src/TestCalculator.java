public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.add(3, 5);
        double result2 = calc.add(2.5, 4.7);
        int result3 = calc.add(1, 2, 3);

        System.out.println("add(int, int): " + result1);
        System.out.println("add(double, double): " + result2);
        System.out.println("add(int, int, int): " + result3);
    }
}

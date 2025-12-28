enum FuelType { GASOLINE, DIESEL, ELECTRIC }


public class Car {
    String brand;
    String model;
    int year;
    Engine engine;
    FuelType fuelType;

    public Car(String b, String m, int y, Engine e, FuelType f) {
        this.brand = b;
        this.model = m;
        this.year = y;
        this.engine = e;
        this.fuelType = f;
    }

    public void displayInfo(){
        System.out.println(year+", "+brand+", "+model);
        engine.showPower();
        switch (fuelType) {
            case GASOLINE -> System.out.println("Traditional engine.");
            case DIESEL -> System.out.println("Powerful but less eco-friendly.");
            case ELECTRIC -> System.out.println("Eco-friendly and quiet.");
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Engine e1 = new Engine(120);
        Engine e2 = new Engine(400);
        Engine e3 = new Engine(250);

        Car s1 = new Car("Honda", "Civic", 2022, e1, FuelType.GASOLINE);
        Car s2 = new Car("BMW", "320d", 2021, e2, FuelType.DIESEL);
        Car s3 = new Car("Tesla", "Model S", 2024, e3, FuelType.ELECTRIC);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}




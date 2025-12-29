public class TestCylinder {
    public static void main(String[] args) {
        System.out.println("Before creating objects: " + Cylinder.getNoOfCylinder());
        System.out.println();

        Cylinder c1 = new Cylinder();
        System.out.println("After creating first object: " + c1.getNoOfCylinder());
        System.out.println("radius: " + c1.r + " height: " + c1.h);
        System.out.println();

        Cylinder c2 = new Cylinder(10, 20);
        System.out.println("After creating second object: " + c2.getNoOfCylinder());
        System.out.println("Base Area: " + c2.calculateBaseArea());
        System.out.println("Surface Area: " + c2.calculateSurfaceArea());
        System.out.println("Volume: " + c2.calculateVolume());
        System.out.println("Mass: " + c2.calculateMass(5.12));
    }
}

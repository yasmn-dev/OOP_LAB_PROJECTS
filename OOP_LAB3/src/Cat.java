public class Cat {
    public int x;
    public double direction;
    public String name;

    public Cat(){
        this(0,180.0,"Sofya");
    }
    public Cat(int x, double direction, String name){
        this.x = x;
        this.direction = direction;
        this.name = name;
    }
    public void move(){
        x+=20;
    }
    public void move2(int a){
        x+=a;
    }
    public void turn(double angle){
        direction += angle;
    }
    public void status(){
        System.out.println("Name: " + name+ " X: " + x+ " Direction: " + direction);
    }
}

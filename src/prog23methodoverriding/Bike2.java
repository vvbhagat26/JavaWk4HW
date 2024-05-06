package prog23methodoverriding;

public class Bike2 extends Vehicle{
    //CHILD CLASS

    @Override
    public void run() {
        super.run();
        System.out.println("bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj=new Bike2(); //creating child class object
        obj.run();//calling method
    }
}

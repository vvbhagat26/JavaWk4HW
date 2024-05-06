package homeworkWK4;

import java.awt.*;

public class Prog16PointCoordinates {
    //Co-ordinates
    private int x;
    private int y;

    Prog16PointCoordinates() {
        this.x=0;
        this.y=0;
    }

    Prog16PointCoordinates(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public void setx(int x) {
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }

    //methods
    public double distance(){
        return Math.sqrt(x * x + y * y);
    }
    public double distance(int x,int y){
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(Point another){
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance(0,0));
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance(0,0));
    }
    }

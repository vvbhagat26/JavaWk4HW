package prog19cylinder;

public class Circle {
    public double radius;

    //constructor
    Circle(double radius){
        if(radius<0){
            radius=0;
        }else
        this.radius=radius;
     }

     //methods

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return (radius*radius*Math.PI);
    }
}

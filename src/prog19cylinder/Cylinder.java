package prog19cylinder;

public class Cylinder extends Circle{

    public double height;

    //constuctor

    Cylinder(double radius,double height){
        super(radius);
        if(height<0){
            this.height=0;
        }else
        this.height=height;
      }

      //Methods
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return height*getArea();
    }

}

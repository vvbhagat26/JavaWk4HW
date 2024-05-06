package prog20poolarea;

public class Cuboid extends Rectangle{

    public double height;

    //Constructor
    Cuboid(double width,double length,double height){
        super(width,length);
        if(height<0){
            height=0;
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

package prog20poolarea;

public class Rectangle {
    public double width;
    public double length;

    //constructor

    Rectangle(double width,double length){
        if(width<0){
            width=0;
        }else
        this.width=width;

        if(length<0){
            length=0;
        }
        this.length=length;
    }
    //Methods
    public double getWidth(){
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width*length;
    }
}

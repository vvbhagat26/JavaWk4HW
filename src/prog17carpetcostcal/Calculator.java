package prog17carpetcostcal;

public class Calculator {
    public Floor floor;
    public Carpet carpet;

    Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }

    public double getCost(){
        return floor.getArea()*carpet.getCost();
    }
}

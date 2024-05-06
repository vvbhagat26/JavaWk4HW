package prog17carpetcostcal;

public class Carpet {
    public double cost;

    Carpet(double cost){
        this.cost=(cost<0?0:cost);
    }
    public double getCost(){
        return cost;
    }
}

package homeworkWK4;

public class Prog18SumCalculator {
    //SumCalculator

    public double firstNumber;
    public double secondNumber;

    //get and set values

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }

    //calculator methods

    public double getAddition(){
        return firstNumber+secondNumber;
    }
    public double getSubtraction(){
        return firstNumber-secondNumber;
    }
    public double getMultiplication(){
        return firstNumber*secondNumber;
    }
    public double getDivision(){
        if(secondNumber==0){
            return 0;}
        else return firstNumber/secondNumber;
        }

    public static void main(String[] args) {
        Prog18SumCalculator calculator = new Prog18SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAddition());
        System.out.println("subtract= " + calculator.getSubtraction());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplication());
        System.out.println("divide= " + calculator.getDivision());

    }}

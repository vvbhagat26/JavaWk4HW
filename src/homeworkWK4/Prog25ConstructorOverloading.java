package homeworkWK4;

public class Prog25ConstructorOverloading {
    //Overlading constructors

    //Instance varables
    int id;
    String name;
    int age;

    //creating two args constructor
    Prog25ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    //creating three args constructor
    Prog25ConstructorOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Prog25ConstructorOverloading s1 = new Prog25ConstructorOverloading(111, "Karan");
        Prog25ConstructorOverloading s2 = new Prog25ConstructorOverloading(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

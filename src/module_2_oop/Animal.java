package module_2_oop;

public class Animal {

    //fields -> properties -> variables
    //instance -> object
    public String name;
    public int age;
    public String color;
    public long distance;

    //class variables
    public static long tail;

    //constructors
    public Animal(){}

    public Animal(String name, int age, String color, long distance) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.distance = distance;
    }


    //behaviors -> instance methods
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void run() {
        System.out.println(name + " is running");
    }


    //class method
    public static void drink() {
        System.out.println("Animal is drinking");
    }
}

//Access modifiers - public, private, protected, default
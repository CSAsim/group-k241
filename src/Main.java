import module_2_oop.Animal;

public class Main {

    public static int a = 12;

    public static void sss() {

        Animal animal = new Animal("Tiger", 10, "Orange", 23); //instance
        Animal animal1 = new Animal("Lion", 12, "Black", 20);
        Animal animal2 = new Animal("Turtle", 11, "Gray", 13);

        Animal[] animals = new Animal[3];
        animals[0] = animal; //112
        animals[1] = animal1; //113
        animals[2] = animal2; //114
        animal.eat();
        a = 9;
        method();
    }

    public static void method() {
        System.out.println("wsvesv");
    }
}

import module_2_oop.Animal;

public class Main {

    public static void main(String [] args) {

        Animal animal = new Animal("Doberman", 10, "dddd");
        animal.specie = "wadfefsf";
//        animal = new Animal("Doberman" , 11, "dddd");
        System.out.println(animal.getAge());
        animal.setAge(4);
        System.out.println(animal.getAge());

//        Animal animal1 = new Animal();
//        Animal.getObjectCount();
//        Animal animal2 = new Animal();
//        Animal animal3 = new Animal();
//        Animal.getObjectCount();
    }
}

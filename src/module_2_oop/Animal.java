package module_2_oop;

public class Animal {

    private String specie;
    private int age;
    private String color;
    public static int objectCount = 0;

    public Animal() { //default constructor
        objectCount++;
    }

    //1. Hell yolu - Constructor-la deyer menimsetme
    public Animal(String specie, int age, String color) {
        this.color = color;
        this.specie = specie;
        this.age = age;
    }

    //2. hell yolu - Encapsulation)
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getSpecie() {
        return specie;
    }

    public void setAge(int age) {
        this.age = age; //this("Doberman", 11, "dddd")
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }


    public static void getObjectCount() {
        System.out.println(objectCount);
    }
}

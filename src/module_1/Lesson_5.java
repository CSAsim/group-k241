package module_1;

public class Lesson_5 {

    public static void main(String[] args) {

        int [] arr2 = new int[]{1,2,3,4}; //112 -> object
        method(arr2); //passing by reference
        System.out.println(arr2[0]);

        int number = 9; //113
        method2(number);   //passing by value
        System.out.println(number);
    }

    public static void method(int [] arr) {
        arr[0] = 23;
    }

    public static void method2(int a) {
        System.out.println(a);
        a = 33;
    }
}

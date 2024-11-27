package lessons.sub;

public class Practice {

    public static void main(String[] args) {
        String str = "Java Programming language";
        if(str.contains("java")) {
            str = str.concat(" Hello world");
        } else if(str.equals("Java Programing language")) {
            str = str.concat(" Baku");
        } else {
            System.out.println("Nothing");
        }

        System.out.println(str);
    }
}

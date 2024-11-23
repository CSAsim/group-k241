package lessons;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;

public class StringMethods {

    public static void main(String[] args) {

        char c = 45;
        char t = 'r';

        System.out.println(c);
        System.out.println(t);

        String str = "Salam Dunya";
        String str2 = "Salam dunya";

        int a = str.length(); //Setrin uzunlugunu
        System.out.println(a);

        byte [] bytesStr = str.getBytes(); //ASCII table-da qarsiligi (simvollarin)
        System.out.println(Arrays.toString(bytesStr));

        str = str.toLowerCase();//kicik simvollar
        System.out.println(str);

        str = str.toUpperCase();//boyuk simvollar
        System.out.println(str);

        boolean result = str.equals(str2); //beraberlik
        System.out.println(result);

        char symbol = str.charAt(5); //5-ci indexdeki simvol
        System.out.println(symbol);

        String newStr = str.concat(str2); //2 stringi birlesdirir
        System.out.println(newStr);
        boolean result2 = str.contains("Sal");//dacil edilen hissinin axtarilan stringde olub olmadigini yoxlayir
        System.out.println(result2);

        boolean result3 = str.equalsIgnoreCase(str2); //beraberliyini yoxlayir ama simvola duyarli deyil
        System.out.println(result3);

    }
}

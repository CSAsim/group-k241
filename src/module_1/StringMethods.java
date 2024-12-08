package module_1;

import java.util.Arrays;

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


        //hello hello ->+1
        /************************************************************************/

        //Lesson 6

        int br; //default qiymeti 0-dir
        final int armud = 9; //constant

        //content - String class-nin tipinde yaradilan bir deyisendir
        String testString = "       Hello, World        "; //112
//        testString = "afwefw"; //114

        //immutable
        String subString = testString.substring(5, 11);
        System.out.println(subString);

        System.out.println("Trim function: " + testString.trim());//Onden ve arxadan bosluqlari silir

        String [] arr = testString.split("llo");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String test = "Java Programming";
        int ind = test.indexOf("mm"); //-1 sehv
        System.out.println(ind);

        int ind2 = test.indexOf(97);
        System.out.println(ind2);

        String replacedStr = test.replace('a','3');
        System.out.println(replacedStr);

        String replacedStr2 = test.replaceAll("Java", "Test");
        System.out.println(replacedStr2);

        String new_content = testString.concat("ssss");
        System.out.println(new_content);

        char [] chars = testString.toCharArray();
        System.out.println(Arrays.toString(chars));


        //String Pool
        String str1 = "Hello";
        String str3 = "Hello";
        String str5 = "hello";

        System.out.println(str1.equals(str3));//true
    }
}

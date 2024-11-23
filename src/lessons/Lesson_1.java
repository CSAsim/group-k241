package lessons;

import java.util.Scanner;
/**
 * Bu Alma Sinfidir
 * @see Lesson_1
 */
public class Lesson_1 {


    public static void main(String[] args) {
        // Javada tam ededleri, Rasional ve Irrasional ededleri gostermek ucun data types var,
        // metni gosteren tipler, true-false gosteren tipler


        //Tam ededler ucun data tipler -> byte, short, int, long
        //Rasional ve Irrasinal ededler ucun -> float, double
        //Setrileri saxlamaq ucun -> String    - "Salam dunya", "#", " "

        //Simvollari saxlamaq ucun -> char - #,@,1,e, - 'a', '#', ' '

        //single line comments
        /*
        KSNKSRFNV
        FWSEFSEGV
        ERGERGERG
        BBERBERBER
        ERBERBE
         */
        //Multi line comment


        byte deyisen1 = 3;// 1 bayt yaddasda yer tutur -> baytin ala bileceyi max=127 min=-128
        short deyisen2 = 35; // 2 bayt yer tutur -> max = 2^15 min = -2^16
        int deyisen4 = 3; // 4 bayt yer tutur ->  max = 2^31 min = -2^32
        long deyisen8 = 1323;  //8 bayt yer tutur yaddasda -> max = 2^63 min = -2^64

        int a = 7;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        float f4 = 12.4f; //4 bayt yer tutur yaddasda
        double d8 = 12.4; //8 bayt yaddasda yer tutur

        double d1 = 2.4;
        double d2 = 9.8;
        d1 = d2 - d1;
        d2 = d2 - d1;
        d1 = d1 + d2;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);


        String alma = "Hello World";
        String s = "4";

        //data_type variable_name = value;

//        Scanner daxilEt = new Scanner(System.in);

//        System.out.print("Deyeri daxil edin: ");
//        int deyer1 = daxilEt.nextInt();
//        System.out.println(deyer1 + 9);
//
//        System.out.print("Double deyeri daxil et: ");
//        double deyer2 = daxilEt.nextDouble();
//        System.out.println("Deyeriniz: " + deyer2);
//
//        System.out.print("Float deyeri daxil et: ");
//        float deyer3 = daxilEt.nextFloat();
//        System.out.println("Deyeriniz: " + deyer3);


        Scanner input = new Scanner(System.in);

        System.out.print("Adiniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadiniz: ");
        String soyad = input.nextLine();

        System.out.print("Yasiniz: ");
        byte yas = input.nextByte();

        System.out.println(ad + " " + soyad + " " + yas);

        String name = "sefwefwefwegfwegfwegweg";
        char c = 'k';

    }
}

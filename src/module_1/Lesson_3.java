package module_1;

public class Lesson_3 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            int n = scanner.nextInt();
//            if(n%2 == 0) {
//                System.out.println("Cutdur");
//            } else {
//                continue;
//            }
//            System.out.println("Davam edir");
//            break;
//        }

        int a = 8; //in memory
        //Arrays
        int [] arrays = {1,2,3,4,5};
        int [] testNumbers = new int[]{2,3,4,5,6}; //arrayin yeni obyekti yaradilir
        int [] numbers = new int[5];//17, 29, 16, 12
        numbers[0] = 17;
        numbers[1] = 29;
        numbers[4] = 12;
        numbers[3] = 16;
        numbers[2] = 39;

        // [I --> array-in sinfini bildirir
        // 5f184fc6 --> array-in unvanini bildirir

//        System.out.println(numbers);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(numbers[i]);
//        }
////        System.out.println(numbers[0]);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Array-in olcusunu daxil edin: ");
//        int lengthOfArray = scanner.nextInt();
//        int [] array = new int[lengthOfArray];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        System.out.println(array[1]);

//        String str = "Salam Dunya ";
//        String [] lines = {"Eflatun Qubadov(Balta)", "Manaf Agayev(Vor)", "Test", "Alma" };
//        for(String s: lines) {
//            System.out.println(s);
//        }

        int [][] arr = {{12,34,34},{1,2,3},{1,2},{2,3,5,6}};
//        System.out.println(arr[3][2]); //5

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

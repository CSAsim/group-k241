package lessons.sub;

public class Practice {

    public static void main(String[] args) {
        //finding second max number of array
        int[] arr = {1, 2, 4, 5, 52, 4, 5, 6, 78, 55};
        int max = Integer.MIN_VALUE; //-2^16
        for (int num : arr) {
            max = Math.max(num,max);
        }
        System.out.println(max);
    }
}

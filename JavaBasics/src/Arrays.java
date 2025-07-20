public class Arrays {
    public static void main(Strings[] args) {
        /*
         * Array Declaration : 
         *  int[] arr;
         *  int arr[];
         * 
         * Allocation : 
         *  int arr[] = new int[20];
         * 
         * Initialization : 
         *  arr[0] = 4;
         * 
         * Direct Intialization : 
         *  int arr[] = {1,2,3,4,5};
         * 
         * For each loop can be used with iterable objects.
         * 
         * Types of Array : 
         * 1-D, 2-D, 3-d etc
         */

        // int arr[] = new int[20];
        
        int sum = 0;
        
        int arr[] = {1,2,34,5,6,7,8,9,10,11};
        System.out.println(arr.length);
        System.out.println(arr[0]);

        for (int i : arr) {
            sum += i;
        }

        System.out.println("Sum : " + sum);

        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            min = (i < min) ? i : min;
        }

        System.out.println("Minimum : " + min);

        // int[][] arr2d = new int[4][3];
    }
}

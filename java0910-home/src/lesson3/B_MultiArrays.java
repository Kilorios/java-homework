package lesson3;

public class B_MultiArrays {
    static void multiarrays() {
        int[][] arr = new int[10][10];
        System.out.println(arr[2][3]);

        for (int i = 0; i < arr.length; i = i + 1)
            for (int j = 0; j < arr[0].length; j = j + 1)
                arr[i][j] = i + j;

        System.out.println(arr[9][9]);
    }
}

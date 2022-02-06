package Lesson_2;

public class Task8 {
    public static void arrChangeDigits() {
        int n = 4;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - i - 1] = 1;
        }
    }
}


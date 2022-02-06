package Lesson_2;

public class Task5 {

    public static void arrayChange(int[] arr) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

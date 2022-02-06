package Lesson_2;

public class Task4 {
    public static void main(String[] args) {
        Task4.year(2020);
    }

    public static String printStringInt(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
        return a;
    }

    public static void year(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}

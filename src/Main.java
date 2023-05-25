import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {90, 86, 76};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(a[0] + ",");
        System.out.print(a[1] + ",");
        System.out.print(a[2]);
        System.out.println();

        double[] b = {1.57, 7.654, 9.986};
        System.out.print(b[0] + ",");
        System.out.print(b[1] + ",");
        System.out.print(b[2]);
        System.out.println();

        int[] c = {90, 86, 76};
        System.out.print(c[0] + ",");
        System.out.print(c[1] + ",");
        System.out.print(c[2]);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(a[2] + ",");
        System.out.print(a[1] + ",");
        System.out.print(a[0]);
        System.out.println();

        double[] b = {1.57, 7.654, 9.986};
        System.out.print(b[2] + ",");
        System.out.print(b[1] + ",");
        System.out.print(b[0]);
        System.out.println();

        int[] c = {90, 86, 76};
        System.out.print(c[2] + ",");
        System.out.print(c[1] + ",");
        System.out.print(c[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

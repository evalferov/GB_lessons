package lesson2;

import java.util.Arrays;

public class Main_lesson2 {
    public static void main(String[] args) {
        //pervoeZadanie();
        // vtoroeZadanie();
        // treteZadanie();
        forZadanie();
    }

    public static void pervoeZadanie() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < 9; i++) {
            switch (a[i]) {
                case 0:
                    a[i] = 1;
                    break;
                case 1:
                    a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void vtoroeZadanie() {
        int[] a = new int[8];
        System.out.println(Arrays.toString(a));
        for (int i = 0, b = 0; i < 8; i++, b = b + 3) {

            a[i] = a[i] + b;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void treteZadanie() {

        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 6) {
                a[i] = a[i] * 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void forZadanie() {
        int[][] a = new int[10][10];

        for (int i = 0; i < 10; i++) {
              a[i][i] = 1;
              a[i][10-i-1] = 1;
        }

        //печатаем массив
        for (int i = 0; i < 10; i++) {
            int ii = 0;
            ii++;
            System.out.println();
            for (int ia = 0; ia < 10; ia++) {
                System.out.print(a[ia][ii] + " ");
            }
        }
    }


}


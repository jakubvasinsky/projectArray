package sk.itsovy.vasinsky.array;

import java.util.Random;

public class MyArray {
    public static void test1() {
        int[] arr = new int[7];
        for (int i = 0; i <= 6; i++) {
            arr[i] = i + 1;
        }
        for (int i = 6; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void test2() {
        System.out.println();
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i <= 9; i++)
            arr[i] = rnd.nextInt(90) + 10;
        int i = 0;
        while (i < 10) {
            System.out.print(arr[i] + " ");
            i++;
        }
        i = 9;
        do {
            System.out.print(arr[i] + " ");
            i--;
        } while (i >= 10);
    }

    public static void test3() {
        System.out.println();
        int[] arr = new int[12];
        Random rnd = new Random();
        for (int i = 0; i <= 11; i++) {
            arr[i] = rnd.nextInt(10);
        }
        double average = 0;
        for (int i = 0; i <= 11; i++) {
            average = arr[i] + average;
        }
        average = average / 12;
        System.out.println(average);
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }


    public static void test4() { //fibonacciho postupnost
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= 19; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i <= 19; i++) {
            System.out.print(arr[i] + " ");
        }
    }

  /*  public static int[] minmax(int a, int b, int c) {

        int[] result = new int[2];
        int min,max;
        if (a > b && a > c) {
             max = a;
        }
        if (b > a && b > c) {
             max = b;
        }
        if (c > b && c > a) {
             max = c;
        }

        if (a < b && a < c) {
             min = a;
        }
        if (b < a && b < c) {
             min = b;
        }
        if (c < b && c < a) {
             min = c;
        }
        result[0]= min;
        result[1]= max;
    return result;
    }
*/


    public static void test6() {
        System.out.println();
        int field1[] = new int[10];
        field1[0] = 1;

        for (int i = 1; i < 10; i++) {

            field1[i] = 2 * field1[i - 1];
        }
        for (int i = 1; i < 10; i++) {
            System.out.print(field1[i] + " ");
        }

        System.out.println();
        int field2[] = new int[10];
        field2[0] = 1;

        for (int i = 0; i < 10; i++) {

            field2[9 - i] = field1[i];
        }
        for (int i = 1; i < 10; i++) {
            System.out.print(field2[i] + " ");
        }
    }




}










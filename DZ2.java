package ru.geekbrains.lesson2;

public class DZ2 {
    public static void main(String[]args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        System.out.println("arr.length:" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }

        int[] arr2 = {0, 3, 6, 9, 12, 15, 18, 21};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 8) ;
            System.out.println("arr .length" + arr2.length);

        }
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) ;
            arr3[i] *= 2;
            System.out.println(arr3[i] + "");
        }
        int[][] arr4 = new int[6][6];
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                if (i == k || i == (k - 1)) arr4[i][k] = 1;
                System.out.print(arr4[i][k] + " ");
            }
        }
    }
}







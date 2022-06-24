//question 문제가 잘못된 점이 있을까요?
package sort;

import java.util.Arrays;

public class BubbleSort {

    static int[] array = new int[]{1, 2, 5, 6, 7, 3, 4, 2};

    public static void main(String[] args) {
        bubbleSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private static void swap(int a, int b) {
        int tmp = 0;
        tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}

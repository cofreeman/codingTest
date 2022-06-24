//question 문제가 잘못된 점이 있을까요?
package sort;

public class BubbleSort {

    static int[] array = new int[]{1, 2, 5, 6, 7, 3, 4, 2};

    public static void main(String[] args) {

        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                    /**
                     * swap 을 option + enter 한뒤에 swap 함수를 구현합니다.
                     */
                }
            }
        }
    }
}

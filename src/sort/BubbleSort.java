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
                     * 리드미컬한 구현을 했으면 여기서 bubbleSort 메서드 구현은 끝입니다.
                     * 리드미컬한 구현이란
                     * array[j] 값이 array[j + 1] 보다 크면 바꿔야지~ 라는 생각을하고 swap(j, j+1) 을 쓰고 끝내는 것입니다.
                     * swap 의 구현은 나중일 입니다.
                     * Go To 5-1
                     */
                }
            }
        }
    }
}

//question 문제가 잘못된 점이 있을까요?
package sort;

public class BubbleSort {
    /**
     1. main method 가 array 라는 변수를 읽으려면 array 변수를 static 변수로 바꿔 클래스내의 모든 범위에서 사용할 수 있게합니다.
     */
    static int[] array = new int[]{1,2,5,6,7,3,4,2};

    public static void main(String[] args) {
        /**
         * static을 바꿨는데도
         */
        bubbleSort(array);
    }

}

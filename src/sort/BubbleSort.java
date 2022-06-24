//question 문제가 잘못된 점이 있을까요?
package sort;

public class BubbleSort {
    /**
     1. main method 가 array 라는 변수를 읽으려면 array 변수를 static 변수로 바꿔 클래스내의 모든 범위에서 사용할 수 있게하거나
     2. main method 안에 new BubbleSort() 로 객체를 생성해 객체를 통해 array 변수를 참조하는 방법이 있습니다.
     3. 또, main method 안에 array 변수를 넣어 변수의 scope 를 줄여 참조하는 방법이 있습니다.
     */
    int[] array = new int[]{1,2,5,6,7,3,4,2};

    public static void main(String[] args) {
        bubbleSort(array);
    }
}

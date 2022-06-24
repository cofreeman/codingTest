//question 문제가 잘못된 점이 있을까요?
package sort;

public class BubbleSort {
    /**
     * 리드미컬하게 구현하기 위해 bubbleSort 에 option + enter 를 했을 겁니다. 하지만 잘 안됩니다.
     * 현재 상태론 bubbleSort 메서드가 매개변수인 array 를 참조할 수 없기 때문입니다.
     * 따라서 array 변수를 main 함수의 scope 안에 넣어주어야합니다.
     *
     * 그 방법은 세가지가 있습니다.
     * 4-1 array 변수를 static 변수로 선언해 해당 클래스 내에서 참조할 수 있게 한다.
     * 4-2 array 변수를 쓸 수 있도록 main 함수안에 BubbleSort 객체를 생성해 참조한다.
     * 4-3 main 함수 안에 array 변수를 집어 넣는다.
     */
    int[] array = new int[]{1,2,5,6,7,3,4,2};

    public static void main(String[] args) {
        bubbleSort(array);
    }
}

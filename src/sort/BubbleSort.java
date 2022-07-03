//question 문제가 잘못된 점이 있을까요?
package sort;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {

    public static void main(String[] args) {
        //todo: 다음 배열 요소의 중복을 제거하고, 다섯 글자 이상의 단어만, 내림차순으로 정렬하여 출력하라.
        String[] array = { "carrot", "apple", "banana", "egg", "meat", "apple" };
        Arrays.stream(array).distinct().filter(s->s.length()>=5).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

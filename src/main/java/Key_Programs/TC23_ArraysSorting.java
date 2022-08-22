package Key_Programs;

import java.util.Arrays;
import java.util.Collections;

public class TC23_ArraysSorting {

    public static void main(String[] args) {
        Integer[] a = {6, 1, 2, 5, 4};

        //      Arrays.parallelSort(a);
//Arrays.sort(a);

        Arrays.sort(a, Collections.reverseOrder());


        System.out.println(Arrays.toString(a));

    }


}

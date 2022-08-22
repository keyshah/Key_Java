package Key_Programs;

import java.util.Arrays;

public class TC22_BubbleSort {

    public static void main(String[] args) {

        int[] a = {111, 7, 3, 4, 5, 9, 4};

        int len = a.length;

        int temp;
        int j = 0;
        while (j < len) {
            for (int i = 0; i < len - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            j++;
        }

        for (int element : a) {
            System.out.println(element);
        }

        System.out.println(Arrays.toString(a));
       /* Arrays.sort(a);
        System.out.println(Arrays.toString(a));*/
    }
}

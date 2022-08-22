package Key_Programs;

import java.util.Arrays;

public class TC16_CompareArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
boolean status = true;

     /*   if (arr2.length == arr1.length) {
            for (int i = 0; i < arr2.length;i++) {
                    if(arr2[i]!=arr1[i]){
                        status = false;
                    }
            }

        }
        else {
            status = false;
        }
       */

        status = Arrays.equals(arr1,arr2);
        if(status==true){
            System.out.println("Arrays are equal");


        }else {
            System.out.println("Arrays are not equal");
        }

    }
}

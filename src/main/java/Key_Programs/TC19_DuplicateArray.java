package Key_Programs;

import java.util.HashSet;

public class TC19_DuplicateArray {
    public static void main(String[] args) {
        int[] a = {4, 2, 3, 4};
        boolean status = false;
       /* for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    System.out.println("Equal values are    " + a[i] + "        " + a[j]);
                    status = true;
                }

            }}*/

        HashSet<Integer> l = new HashSet();

        for (int v : a) {
          //  System.out.println(   l.add(v));
            if(l.add(v)==false){
                status = true;
            }
        }

        if (status==true) {
            System.out.println("Duplicate elements found");
        } else {
            System.out.println("No Duplicates");
        }

    }
}


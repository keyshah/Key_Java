package Key_Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TC21_BinarySearch {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9};

       int search_key = 1;
         int f =0;
        int l= a.length - 1;
        int m = (f+l)/2;
        System.out.println(m);
        if(a[m]== search_key){
            System.out.println("Search key is " + a[m]);
        } else if (a[m]<search_key) {
            System.out.println(("Search key is greater than"));
            for(int i=m;i<l;i++){
                if(a[i]==search_key){
                    System.out.println("Search key is " + a[i-1]);
                }
            }


        } else if (a[m]>search_key) {
            System.out.println("Search key is less than middle");
            for(int i=m;i>=f;i--){
                if(a[i]==search_key){
                    System.out.println("Search key is " + a[i]);
                }
            }
        }



    /*    System.out.println(l);
        System.out.println(m);
        System.out.println(f);


        System.out.println(     Arrays.binarySearch(a,search_key));*/


    }
}

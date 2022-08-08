package Key_Programs;

public class TC1_SwapNumbers {


    public static void main(String[] args) {

        //  System.out.println("test");
        int a = 33;
        int b = 13;
        System.out.println("Before Swapping - Value of a is " + a + " Value of b is " + b);
        // Logic 1
       /*
       int t;
        t=a;
        a=b;
        b=t;

        //Logic 2

        a = a + b;
        b = a - b;
        a = a - b;
*/

        //Logic 3
        a = a*b;
        b= a/b;
        a = a/b;




        System.out.println("After Swapping - Value of a is " + a + " Value of b is " + b);


    }
}

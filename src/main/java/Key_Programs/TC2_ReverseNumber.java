package Key_Programs;

import java.util.Scanner;

public class TC2_ReverseNumber {

    public static void main(String[] args) {


/*        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();*/

        int a = 1234;


     /*   int rev = 0;

        while (a!=0){
            rev = rev*10 + a%10;
            a = a/10;
        }*/

      //  int rev;

/*
        StringBuffer sb = new StringBuffer(String.valueOf(a));
        StringBuffer rev = sb.reverse();
*/




        StringBuilder sbl = new StringBuilder();
        StringBuilder  rev = sbl.append(a).reverse();
       // StringBuilder rev= aa.reverse();
        System.out.println(rev);


    }
}

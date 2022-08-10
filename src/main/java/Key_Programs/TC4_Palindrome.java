package Key_Programs;

import java.util.Scanner;

public class TC4_Palindrome {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int  num = sc.nextInt();
        int a = num;
        int rev = 0;

        while (num!=0){

            rev = rev*10 + num%10;
            num = num/10;
        }

        if(a==rev){
            System.out.println("Number is palindrome" + "num is" + a + "and" + "rev is" + rev);
        }
        else {
            System.out.println("Number is not palindrome" + "num is" + a + "and" + "rev is" + rev);
        }
    }
}

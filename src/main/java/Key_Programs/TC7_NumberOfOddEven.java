package Key_Programs;

public class TC7_NumberOfOddEven {

    public static void main(String[] args) {

        int a = 1213123;
        int num=0;
        int i = 0,k =0;

while(a!=0) {
    if ((a % 10) % 2 == 0) {

        i++;
        a = a / 10;
    } else {

        k++;
        a = a / 10;
    }
}
        System.out.println(i + "  " +k);
    }
}

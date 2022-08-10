package Key_Programs;

public class TC6_NumOfDigits {

    public static void main(String[] args) {
        int num = 123;
        int i = 0;
        while (num != 0) {
            num = num / 10;
            i++;
            System.out.println(num);
        }
        System.out.println(i);
    }
}

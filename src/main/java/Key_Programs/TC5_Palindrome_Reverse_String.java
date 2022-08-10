package Key_Programs;

public class TC5_Palindrome_Reverse_String {

    public static void main(String[] args) {

        String str = "MADAM";
        StringBuilder sb = new StringBuilder(str);
        String rev = String.valueOf(sb.reverse());

        if(str.equals(rev)){
            System.out.println("good");
            System.out.println(str);
            System.out.println(rev);

        }
        else {
            System.out.println("bad");

            System.out.println(str);
            System.out.println(rev);
        }
    }
}

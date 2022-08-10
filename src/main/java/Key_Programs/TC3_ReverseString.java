package Key_Programs;

public class TC3_ReverseString {

    public static void main(String[] args) {

        String a = "Keyur";


        String rev = "";

       /* int len = a.length();

        for(int i=len-1;i>=0;i--){
            rev = rev + a.charAt(i);
                    }
*/

        char key[] = a.toCharArray();
        int len = a.length();

        for(int i = len-1;i>=0;i--){
            rev = rev + key[i];
        }


        System.out.println(rev);





/*



        StringBuffer sb = new StringBuffer(a);
        StringBuffer temp = sb.reverse();

        System.out.println(temp);
         */
    }


}

package Key_Programs;

public class TC24_RemoveJunk {

    public static void main(String[] args) {

        String s = "Ss ttTT)(_";

       s= s.replaceAll("[^a-zA-Z0-9 ]","1");
        System.out.println(s);
    }
}

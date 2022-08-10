package Key_Programs;

import org.apache.commons.lang.RandomStringUtils;

public class TC12_GenerateRandomNumbersStrings {

    public static void main(String[] args) {

     /*   Random rand = new Random();
        int k = rand.nextInt(100);
        System.out.println(k);*/

     /*   double k = Math.random();
        System.out.println(k);

        int ak = (int) Math.random();
        System.out.println(ak);*/

        String test = RandomStringUtils.randomNumeric(5);
        System.out.println(test);

        String str = RandomStringUtils.randomAlphabetic(5);
        System.out.println(str);

    }
}

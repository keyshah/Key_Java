package Key_Programs;

public class TC17_FindMissingArrayNumber {

    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};

        int sum1=0;
        for(int i=0;i<a1.length;i++){
            sum1 =sum1 +a1[i];
        }

        int sum2 =0;
        for(int i=0;i<=5;i++){
            sum2 = sum2 + i;
        }


        System.out.println(sum1);
        System.out.println(sum2);

        int missingnumber = sum2-sum1;
        System.out.println(missingnumber);
    }
}

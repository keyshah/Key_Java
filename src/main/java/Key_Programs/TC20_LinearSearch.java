package Key_Programs;

public class TC20_LinearSearch {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,23};
        int search = 23;
        boolean flag = false;

        for (int i=0;i<a.length;i++){
            if(search==a[i]){
                System.out.println("Duplicate integer found " + i);
                flag = true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Duplicates found");
        }
        else {
            System.out.println("No Duplicates");
        }
    }
}

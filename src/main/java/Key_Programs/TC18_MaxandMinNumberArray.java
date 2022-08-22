package Key_Programs;

public class TC18_MaxandMinNumberArray {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,12,34,13,1};
        int max =a[0];
        for (int i =0;i<a.length;i++){
            if(a[i]<max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

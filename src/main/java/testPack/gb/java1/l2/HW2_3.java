package testPack.gb.java1.l2;

public class HW2_3 {

    public static void main(String[] args) {
        int[] arr = {2, -5, 0, 3, -1, -15};
        for(int a : arr){
            posOrNeg(a);
            System.out.println(pOrN(a));
        }
        //posOrNeg(2);
    }
    public static void posOrNeg(int a){
        System.out.print("Число " + a);
        if(a < 0){
            System.out.println(" - отрицательное.");
        }else {
            System.out.println(" - положительное.");
        }
    }
    public static boolean pOrN(int a){
        if(a<0){
            return true;
        }else {
            return false;
        }
    }
}

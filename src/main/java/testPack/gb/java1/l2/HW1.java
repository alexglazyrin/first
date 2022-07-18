package testPack.gb.java1.l2;

public class HW1 {
    public static void main(String[] args) {
        System.out.println(" - " + eq10_20(2,2));
        System.out.println(" - " + eq10_20(10, 5));
        System.out.println(" - " + eq10_20(2,19));
    }
    public static boolean eq10_20(int a, int b){
        if((a+b)>=10 && (a+b)<=20){
            System.out.print("Сумма " + a + " + " + b + " равна " + (a+b));
            System.out.print(". Попадание в диапазон 10..20");
            return true;
        } else{
            System.out.print("Сумма " + a + " + " + b + " равна " + (a+b));
            System.out.print(". Попадание в диапазон 10..20");
            return false;
        }
    }
}

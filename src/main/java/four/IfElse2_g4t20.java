package four;

public class IfElse2_g4t20 {
    static String test(int testval, int begin, int end){
        if (testval >= begin && testval <= end)
            return "Значение внутри заданного диапазона";
        else
            return "Значение вне диапазона";
    }

    public static void main(String[] args) {
        System.out.println(test(5, 1, 10));
        System.out.println(test(0, 1, 10));
        System.out.println(test(11, 5, 10));
    }
}

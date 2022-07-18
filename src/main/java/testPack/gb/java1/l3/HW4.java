package testPack.gb.java1.l3;

public class HW4 {
    public static void main(String[] args) {
        int[][] qArr = new int[3][3];
        for (int i = 0; i < qArr.length; i++) {
            for (int j = 0; j < qArr.length; j++) {
                if (i == j) {
                    qArr[i][j] = 1;
                } else {
                    qArr[i][j] = 0;
                }
                System.out.print(qArr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

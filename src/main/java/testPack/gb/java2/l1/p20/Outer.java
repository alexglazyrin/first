package testPack.gb.java2.l1.p20;

public class Outer {
    class Inner {
        private int innerVar;

        public Inner(int innerVar){
            this.innerVar = innerVar;
        }
        void innerTest(){
            System.out.println("innerVar: " + innerVar);
            System.out.println("outerVar: " + outerVar);
        }
    }

    private int outerVar;

    public Outer (int outerVar){
        this.outerVar = outerVar;
    }

    public void outerTest(){
        System.out.println("outerVar: " + outerVar);
        Inner io = new Inner(20);
        System.out.println("io.innerVar = " + io.innerVar);
    }
}

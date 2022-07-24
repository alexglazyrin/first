package testPack.gb.java2.l1.hw;

public class Wall {
    int height;
    Wall(int height){
        this.height = height;
    }
    boolean isDone(int height, int maxHeight){

        if (height <= maxHeight){
            System.out.println("Wall done");
            return true;
        }else {
            System.out.println("Wall fall");
            return false;
        }
    }

}

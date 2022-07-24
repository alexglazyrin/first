package testPack.gb.java2.l1.hw;

public class RunPlace {
    private int distance;
    private int maxDistance;


    RunPlace(int distance) {
        this.distance = distance;
    }

    public boolean isDone(int taskDistance){
        if (distance <= maxDistance){
            System.out.println(" пробежал!");
            return true;
        } else {
            System.out.println(" слишком большое расстояние!");
            return false;
        }
    }
}

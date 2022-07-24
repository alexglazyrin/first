package testPack.gb.java2.l1.p20;

public class FruitClass {
    public static void main(String[] args) {
        /*Fruit fruit = Fruit.APPLE;
        System.out.println(fruit);
        if(fruit == Fruit.APPLE){
            System.out.println("fruit really is apple");
        }
        switch (fruit){
            case APPLE:
                System.out.println("fruit - apple");
                break;
            case ORANGE:
                System.out.println("fruit - orange");
                break;
            case CHERRY:
                System.out.println("fruit - cherry");
                break;
        }*/
        /*System.out.println("All elements enum: ");
        for(Fruit fruit : Fruit.values()){
            System.out.println(fruit);
        }
        System.out.println("Searching by name: " + Fruit.valueOf("BANANA"));*/
        for (Fruit fruit : Fruit.values()){
            System.out.printf("Средний вес фрукта %s составляет: %d ед.\n", fruit.getRussianTitle(), fruit.getWeight());
        }
    }
}

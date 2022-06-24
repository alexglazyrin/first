package five.tasks;

import java.util.Arrays;

class ClConstruct_g5t17 {
    ClConstruct_g5t17(String s){
        System.out.println("Arg: " + s);
    }

    public static void main(String[] args) {
        ClConstruct_g5t17 [] construct = new ClConstruct_g5t17[]{
                new ClConstruct_g5t17("abc"),
                new ClConstruct_g5t17("def"),
                new ClConstruct_g5t17("ghi"),
        };
        System.out.println(Arrays.toString(construct));
    }
}

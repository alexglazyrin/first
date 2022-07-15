package eight.p260;

import static six.Print.print;

public class Apply {
    public static void process(Processor p, Object s){
        print("Используем Processor " + p.name());
        print(p.process(s));
    }
    public static String s =
            "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

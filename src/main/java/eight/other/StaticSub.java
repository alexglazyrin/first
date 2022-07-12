package eight.other;

class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Производная версия staticGet()";
    }
    public String dynamicGet(){
        return "Производная версия dynamicGet()";
    }
}

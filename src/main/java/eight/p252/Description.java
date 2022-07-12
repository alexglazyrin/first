package eight.p252;

import static six.Print.print;

class Description {
    private String s;
    Description(String s){
        this.s = s;
        print("Создаем Description " + s);
    }
    protected void dispose(){
        print("Завершаем Description " + s);
    }
}

package eight.p252;

import static six.Print.print;

class Characteristic {
    private String s;
    Characteristic(String s){
        this.s = s;
        print("Создаем Characteristic " + s);
    }
    protected void dispose(){
        print("Завершаем Characteristic " + s);
    }
}

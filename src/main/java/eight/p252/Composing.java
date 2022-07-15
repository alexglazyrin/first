package eight.p252;

import static six.Print.print;

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        print("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        print("disposing " + this);
        shared.dispose();
    }
    public String toString(){return "Composing " + id;}
}

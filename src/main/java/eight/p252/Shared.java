package eight.p252;

import static six.Print.print;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        print("Создаем " + this);
    }
    public void addRef(){refcount++;}
    protected void dispose(){
        if(--refcount == 0)
            print("Disposing " + this);
    }
    public String toString(){return "Shared " + id;}
}

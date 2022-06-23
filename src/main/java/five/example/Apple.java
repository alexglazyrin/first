package five.example;

class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

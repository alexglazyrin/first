package five.tasks;

class ClassWith2Method {

    void testCWM (){
        workCWM();
        this.workCWM();
    }
    void workCWM(){
        System.out.println("123");
    }
}

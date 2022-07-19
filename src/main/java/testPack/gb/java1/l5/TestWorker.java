package testPack.gb.java1.l5;

public class TestWorker {
    public static void main(String[] args) {
        Worker[] workers = new Worker[3];
        workers[0] = new Worker("FIO", "superviser", "FIO@mail.ru", "+79211212341", 100000, 34);
        workers[1] = new Worker("GAO", "ingeneer", "ing@mail.ru", "+79112345678", 200000, 32);
        workers[2] = new Worker("MAO", "CEO", "dir@mail.ru", "+79999991999", 2345670, 47);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() >= 40)
                workers[i].workerInfo();
        }
        //worker1.workerInfo();

    }
}

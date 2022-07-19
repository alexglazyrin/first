package testPack.gb.java1.l5;

public class Worker {
    private String FIO;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    Worker(String FIO, String position, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void workerInfo() {
        System.out.println(FIO);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(salary);
        System.out.println(age);
    }
}

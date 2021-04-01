package HW5;

public class Rab {
    private String fio;
    private int age;
    private String email;


    public int getAge() {
        return age;
    }

    public Rab(String fio, String email, int age) {
        this.fio = fio;
        this.email = email;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("fio "+fio+"email"+email+"age "+age);
    }
}

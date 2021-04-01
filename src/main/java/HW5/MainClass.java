package HW5;

public class MainClass {
    public static void main(String[] args) {
        Rab[] employees = new Rab[5];
        employees[0] = new Rab("Данилов","dan@hkg.ru",39);
        employees[1] = new Rab("Петров","pet@yfy.ru",40);
        employees[2] = new Rab("Васечкин","vas@kjhkj.ru",41);
        employees[3] = new Rab("Иванов","ivan@kjhg.ru",42);
        employees[4] = new Rab("Егоров","egor@ukgbg.ru",38);

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].printInfo();
            }
        }
    }
}

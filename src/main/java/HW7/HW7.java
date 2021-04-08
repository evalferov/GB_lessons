package HW7;

class Plate {

    private int food;
    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 400;
        System.out.println("Положил вмиску 800 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}

class Cat {

    private String name;
    private int appetite;
    private int satietyTime;
    private int satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    int getSatietyTime() {
        return satietyTime;
    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety += satietyTime;
    }
}


public class HW7 {

    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Васька", 80, 3);
        cat[1] = new Cat("Мурка", 90, 2);
        cat[2] = new Cat("Кис-кис", 100, 1);
        Plate plate = new Plate(700);
        System.out.println("Всего котов: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + ", едят через " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + " и " + cat[2].getSatietyTime() + " часа");
        System.out.println("В миске " + plate.getFood() + " гкорма.");

        do {
            for (Cat i : cat) {

                               if (i.getSatiety() == 0) {

                                        if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }


                    i.eat(plate);
                    System.out.println(i.getName() + " съел " + i.getAppetite() + " грамм корма, проголодается через " + (i.getSatiety()) + " часа");
                }


                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("Прошло " + TIME + " часов В миске осталось " + plate.getFood() + " корма.");
            TIME++;

        } while (TIME <= 24);
    }
}

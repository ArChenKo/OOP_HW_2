package lesson2;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Черныш",24),
                new Cat("Муся",27),
                new Cat("Понка",15),
                new Cat("Уголек",13),
                new Cat("Пушок",26)
        };
        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat:cats) {
            cat.eat(plate.getFood());
            plate.setFood(plate.getFood() - cat.getAppetite());
        }
        plate.info();
        for (Cat cat:cats) {
            cat.getSatiety();
        }
//        plate.appendFood(8);
//        plate.info();
//        plate.appendFood(8);
//        plate.info();
//        plate.appendFood(8);
//        plate.info();
//        plate.appendFood(8);
//        plate.info();
    }
}

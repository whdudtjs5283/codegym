package level2;

/**
 * CodeGym / Java Course / 자바 구문 / 변수를 생성하는 다양한 방법
 * 레벨 2, 레슨 5
 */
public class Lesson5 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
        solution3();
    }

    /**
     * solution3
     */
    public static class Cat2 {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }

    /**
     * Create Cat, Dog, Fish, and Woman objects.
     * Assign an owner to each animal.
     * 요구 사항:
     * •	The program should not display text on the screen.
     * •	In the main method, create Cat, Dog, Fish, and Woman objects, and store references to them in variables.
     * •	In the main method, set the Woman object as the owner of each animal.
     * •	The Cat, Dog, and Fish classes must have only one Woman variable named owner.
     * •	The Woman class must not have variables.
     */
    private static void solution3() {
        Woman woman = new Woman();
        Cat2 cat = new Cat2();
        Dog dog = new Dog();
        Fish fish = new Fish();

        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }

    /**
     * solution2
     */
    public static class Cat {

    }

    /**
     * Create 10 Cat variables and 8 Cat objects.
     * 요구 사항:
     * •	The program should not display text on the screen.
     * •	The main method must have 10 Cat variables.
     * •	In the main method, 8 variables must be initialized immediately upon creation.
     * •	There should be no variables in the Cat class.
     * •	There should be no methods in the Cat class.
     */
    private static void solution2() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9;
        Cat cat10;
    }

    /**
     * Comment out as many lines as possible to display the number 19
     * 요구 사항:
     * •	The program should display the number 19.
     * •	Don't change the lines that declare variables.
     * •	Don't change the line responsible for screen output.
     * •	You need to comment out some lines and leave the remaining lines unchanged.
     */
    private static void solution1() {
        int x = 1;
        int y = 0;

        y = y + 3 * x;
        // x = x * 2;
        x = x * 16;
        // y = y + 2 * x;
        y = y + x;

        System.out.println(y);
    }
}

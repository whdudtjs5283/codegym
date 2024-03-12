package level4;

/**
 * CodeGym / Java Course / 자바 구문 / 변수 범위에 대한 추가 정보
 * 레벨 4, 레슨 1
 */
public class Lesson1 {
    public static void main(String[] args) {
//        solution1();
        solution2();
    }

    /**
     * solution2
     */
    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applePrice) {
            Apple.applePrice += applePrice;
        }
    }

    /**
     * Calculate the total cost of apples.
     * The total cost of apples corresponds to public static int applePrice.
     * 요구 사항:
     * •	The program should display text on the screen.
     * •	The Apple class's addPrice method should not display text on the screen.
     * •	The Apple class's applePrice variable must be a static int initialized to zero.
     * •	The main method should call the addPrice method only twice.
     * •	The Apple class's addPrice method should increase the cost of apples by the passed-in value.
     */
    private static void solution2() {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("The cost of apples is " + Apple.applePrice);
    }

    /**
     * solution1
     */
    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("The age in adjustAge() is " + age);
        }
    }

    /**
     * Think about what the program is doing.
     * Fix the programming error so that person.age changes value.
     *
     * Hint:
     * carefully review the adjustAge method.
     * 요구 사항:
     * •	The program should display text on the screen.
     * •	The Person class should have a public int field called age.
     * •	The Person class's adjustAge method should display text on the screen.
     * •	The Person class's adjustAge method must have only one int parameter named age, and the method must be void.
     * •	The main method should call the adjustAge method only once.
     * •	The Person class's adjustAge method should increase the Person's age by 20.
     */
    private static void solution1() {
        Person person = new Person();
        System.out.println("Age: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age: " + person.age);
    }
}

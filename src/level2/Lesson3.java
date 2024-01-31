package level2;

/**
 * CodeGym / Java Course / 자바 구문 / 개체 만들기
 * 레벨 2, 레슨 3
 */
public class Lesson3 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
        solution3();
    }

    /**
     * Write a program that displays: "If you don't code well, Java will come and eat your memory".
     * 요구 사항:
     * •	The program should display text on the screen.
     * •	The text should begin with "If you".
     * •	The text should end with "memory".
     * •	The text should consist of 58 characters, including spaces and punctuation marks.
     * •	The displayed text must match the task conditions.
     */
    private static void solution3() {
        System.out.println("If you don't code well, Java will come and eat your memory");
    }

    /**
     * solution2
     */
    public static class Dog {
        public String name;
    }

    /**
     * Create 3 Dog objects.
     * Store each instance in a separate variable.
     * Give them the names "Max", "Bella", and "Jack".
     * 요구 사항:
     * •	The program should not display text on the screen.
     * •	The main method should have only three Dog variables.
     * •	The variables must be immediately assigned values.
     * •	Each Dog object must be assigned a name.
     * •	The Dog class must have a single variable called name.
     * •	The Dog class should not have methods.
     */
    private static void solution2() {
        Dog dog1 = new Dog();
        dog1.name = "Max";

        Dog dog2 = new Dog();
        dog2.name = "Bella";

        Dog dog3 = new Dog();
        dog3.name = "Jack";
    }

    /**
     * solution1()
     */
    public static class Cat {

    }

    /**
     * Create a Cat object twice.
     * Store each instance in its own variable.
     * The variable names must be different.
     * 요구 사항:
     * •	The program should not display text on the screen.
     * •	The main method should have only two Cat variables.
     * •	The variables must be immediately assigned values.
     * •	There should be no variables in the Cat class.
     * •	There should be no methods in the Cat class.
     */
    private static void solution1() {
        Cat cat1 = new Cat();
        Cat cat2 = null;

        cat2 = cat1;
        cat1 = null;
    }
}

package level2;

/**
 * CodeGym / Java Course / 자바 구문 / 호출 방법 연습
 * 레벨 2, 레슨 8
 */
public class Lesson8 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
        solution3();
    }

    /**
     * solution3
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int min(int a, int b, int c) {
        int min = a <= b ? a : b;
        return min <= c ? min : c;
    }
    /**
     * Write a function that computes the minimum of three numbers.
     *
     * Hint:
     * You need to write the body of the existing min function.
     * 요구 사항:
     * •	The program should display text on the screen.
     * •	The min method should not display text on the screen.
     * •	The main method should call the min method four times.
     * •	The main method should display the result of the min method. Each time, on a new line.
     * •	The min method must return the minimum of the numbers a, b, and c.
     */
    private static void solution3() {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

    /**
     * solution2
     *
     * @param a
     * @param b
     * @return
     */
    public static int min(int a, int b) {
        return a <= b ? a : b;
    }

    /**
     * Write a function that returns the minimum of two numbers.
     *
     * Hint:
     * You need to write the body of the existing min function.
     * 요구 사항:
     * •	The program should display text on the screen.
     * •	The min method should not display text on the screen.
     * •	The main method should call the min method three times.
     * •	The main method should display the result of the min method. Each time, on a new line.
     * •	The min method must return the minimum of the numbers a and b.
     */
    private static void solution2() {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }

    /**
     * solution1
     *
     * @param earthWeight
     * @return
     */
    public static double getWeight(int earthWeight) {
        return earthWeight * 0.17;
    }

    /**
     * "Amigo, did you know that lunar gravity is about 17% of gravity on Earth?"
     * "Nope."
     * "Neither did I. Now this information will be used a lot. To avoid having to manually calculate it each time, implement a getWeight(int) method that takes a person's body weight on Earth (in newtons), and returns the weight of that person on the moon (in newtons).
     * The method should return a double."
     *
     * Consider this example:
     * The getWeight method is called with the argument 888.
     *
     * Example output:
     * 150.96
     * 요구 사항:
     * •	The getWeight(int) method must be public and static.
     * •	The getWeight method must return a double.
     * •	The getWeight method should not display anything.
     * •	The getWeight method should correctly convert the Earth weight in newtons to the lunar weight, and then return this value.
     */
    private static void solution1() {
        System.out.println(getWeight(888));
    }
}

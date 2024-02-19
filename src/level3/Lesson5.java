package level3;

/**
 * CodeGym / Java Course / 자바 구문 / 연쇄
 * 레벨 3, 레슨 5
 */
public class Lesson5 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
        solution3();
    }

    /**
     * solution3
     *
     * @param hour
     * @return
     */
    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }

    /**
     * Add a public static int convertToSeconds(int hour) method that converts hours to seconds.
     * Call it twice in the main method with any arguments.
     * Display the results, each time on a new line.
     * 요구 사항:
     * •	Add the convertToSeconds method. It must be public static, and take and return ints.
     * •	The convertToSeconds method must convert the passed number of hours to seconds.
     * •	The main method must call the convertToSeconds method twice.
     * •	The main method should display the result of the calls, each time on a new line.
     * •	The convertToSeconds method should not display anything.
     */
    private static void solution3() {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(20));
    }

    /**
     * solution2
     *
     * @param s
     */
    public static void writeToConsole(String s) {
        System.out.println("printing: " + s);
    }

    /**
     * Implement the public static void writeToConsole(String s) method, which adds "printing: " to the beginning of the string and displays the altered string.
     *
     * Example output for "Hello, World! ":
     * printing: Hello, World!
     * 요구 사항:
     * •	Add a writeToConsole method that takes a String argument.
     * •	The writeToConsole method must be void.
     * •	The writeToConsole method must be static.
     * •	The writeToConsole method must be public.
     * •	The writeToConsole method should add "printing: " to the beginning of the string and display the result.
     * •	The program should display "printing: Hello, World!".
     */
    private static void solution2() {
        writeToConsole("Hello, World!");
    }

    /**
     * solution1
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static long getVolume(int a, int b, int c) {
        return (long) a * b * c * 1000;
    }

    /**
     * Amigo, today our task is to fill the ship's pool. Calculate how many liters of water are needed to fill the pool all the way up. The pool is known to have linear dimensions a x b x c, given in meters.
     * These dimensions are passed to the getVolume method. The method should return the number of liters of water needed to fill the pool.
     *
     * Consider this example:
     * The getVolume method is called with the arguments 25, 5, and 2.
     *
     * Example output:
     * 250000
     * 요구 사항:
     * •	The getVolume(int, int, int) method must be public and static.
     * •	The getVolume(int, int, int) method must return a long.
     * •	The getVolume(int, int, int) method should not display anything.
     * •	The getVolume(int, int, int) method must return the correct amount of water, in liters, that is needed to fill the pool.
     */
    private static void solution1() {
        System.out.println(getVolume(25, 5, 2));
    }
}

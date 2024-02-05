package level3;

/**
 * CodeGym / Java Course / 자바 구문 / 다시 한 번 화면 출력
 * 레벨 3, 레슨 3
 */
public class Lesson3 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
        solution3();
    }

    /**
     * solution3
     * @param i
     * @return
     */
    public static double addTenPercent(int i) {
        return i + (i * 0.1);
    }

    /**
     * Write the code for the addTenPercent method, which increases the passed integer by 10%.
     * Use the return statement to return the result from the addTenPercent method.
     *
     * Consider this example:
     * return 123 * 435;
     * 요구 사항:
     * •	The addTenPercent method should increase the passed number by 10% percent.
     * •	The main method should call the addTenPercent method.
     * •	The main method should display the results of the call.
     * •	The addTenPercent method should not display anything.
     */
    private static void solution3() {
        System.out.println(addTenPercent(9));
    }

    /**
     * solution2
     * @param eur
     * @param exchangeRate
     * @return
     */
    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }

    /**
     * Write code for the convertEurToUsd method, which converts euros to dollars at a given exchange rate.
     * Use a return statement to return the result from the convertEurToUsd method. Example: return 123*435;
     * Call the convertEurToUsd method twice in the main method with any arguments.
     * Display the results, each time on a new line.
     *
     * Hint:
     * The result is calculated using the following formula: US dollars = euros * exchange rate
     * 요구 사항:
     * •	The convertEurToUsd method must multiply the euro amount by the exchange rate and return the result.
     * •	The main method must call the convertEurToUsd method twice with any arguments.
     * •	The main method should display the result of the calls, each time on a new line.
     * •	The convertEurToUsd method should not display anything.
     */
    private static void solution2() {
        System.out.println(convertEurToUsd(123, 435));
        System.out.println(convertEurToUsd(122, 436));
    }

    /**
     * solution1
     * @param s
     */
    public static void printString(String s) {
        System.out.println(s);
    }

    /**
     * Add the public static void printString(String s) method, and write code that will make it display the passed string.
     * 요구 사항:
     * •	Add a printString method that takes a String argument.
     * •	The printString method must be void.
     * •	The printString method must be static.
     * •	The printString method must be public.
     * •	The printString method must display the passed text.
     * •	The program should display "Hello, Amigo!".
     */
    public static void solution1() {
        printString("Hello, Amigo!");
    }
}

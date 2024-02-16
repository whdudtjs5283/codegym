package level3;

/**
 * CodeGym / Java Course / 자바 구문 / 물건을 전시하는 연습
 * 레벨 3, 레슨 4
 */
public class Lesson4 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
//        solution3();
//        solution4();
        solution5();
    }

    /**
     * Display the sum of numbers from 1 to 5, line by line (there should be 5 lines):
     * 1
     * 1+2=3
     * 1+2+3=6
     * ...
     *
     * Example output:
     * 1
     * 3
     * 6
     * ...
     * 요구 사항:
     * •	The program should output text.
     * •	The displayed text should contain 5 lines.
     * •	The number in each new line must be greater than the previous one.
     * •	The displayed text must match the task conditions.
     */
    private static void solution5() {
        System.out.println(1);
        System.out.println(1 + 2);
        System.out.println(1 + 2 + 3);
        System.out.println(1 + 2 + 3 + 4);
        System.out.println(1 + 2 + 3 + 4 + 5);
    }

    /**
     * Display the product of the 10 numbers from 1 to 10.
     * The result is a single number.
     *
     * Hint:
     * it will be three million and change.
     * 요구 사항:
     * •	The program must display an integer.
     * •	The main method should call the System.out.println method.
     * •	The displayed number should be more than three million.
     * •	The displayed number must match the task conditions.
     */
    private static void solution4() {
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);
    }

    /**
     * solution3
     */
    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }

    /**
     * Create 5 Zerg units, 3 Protoss units and 4 Terran units.
     * Give them all unique names.
     * 요구 사항:
     * •	Don't change the Zerg, Protoss, and Terran classes.
     * •	Create 5 Zerg objects and name each of them.
     * •	Create 3 Protoss objects and name each of them.
     * •	Create 4 Terran objects and name each of them.
     */
    private static void solution3() {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();

        zerg1.name = "zerg1";
        zerg2.name = "zerg2";
        zerg3.name = "zerg3";
        zerg4.name = "zerg4";
        zerg5.name = "zerg5";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();

        protoss1.name = "protoss1";
        protoss2.name = "protoss2";
        protoss3.name = "protoss3";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();

        terran1.name = "terran1";
        terran2.name = "terran2";
        terran3.name = "terran3";
        terran4.name = "terran4";
    }

    /**
     * Arrange the brackets correctly (differently) so that the number 382 is displayed on the screen.
     * 요구 사항:
     * •	The program must not read data from the keyboard.
     * •	The main method must contain only one call to System.out.println.
     * •	The sequence of digits and arithmetic operations can not be changed.
     * •	The final expression should have 2 opening and 2 closing parentheses.
     * •	The main method should display the number 382.
     */
    private static void solution2() {
        System.out.println(2 * (3 + 4 * (5 + 6 * 7)));
    }

    /**
     * Display your birth date in the form:
     * MAY 1 2012
     * 요구 사항:
     * •	The displayed text should contain the month, day and year, separated by spaces.
     * •	The name of the month should be printed in English in uppercase letters.
     * •	The year must consist of four digits and be at least 1900.
     * •	The birth date must be earlier than the current date.
     */
    private static void solution1() {
        System.out.println("MAY 1 2012");
    }
}

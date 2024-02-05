package level3;

/**
 * CodeGym / Java Course / 자바 구문 / 가장 간단한 프로그램
 * 레벨 3, 레슨 1
 */
public class Lesson1 {
    public static void main(String[] args) {
        solution();
    }

    /**
     * solution
     * @param a
     * @param b
     */
    public static void div(int a, int b) {
        System.out.println(a / b);
    }

    /**
     * Implement public static void div(int a, int b).
     * The method should divide the first number by the second, and display the result of dividing a by b.
     * The displayed result should be an integer.
     * 요구 사항:
     * •	The div method must divide a by b.
     * •	The div method must display the result of the division.
     * •	The main method should call the div method 3 times.
     * •	The main method should not call a screen output method.
     * •	The program should output three numbers: 2 1 0. Each number on a separate line.
     */
    private static void solution() {
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }
}

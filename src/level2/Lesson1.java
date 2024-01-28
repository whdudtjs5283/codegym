package level2;

/**
 * CodeGym / Java Course / 자바 구문 / 개체 상호 작용
 * 레벨 2, 레슨 1
 */
public class Lesson1 {
    public static void main(String[] args) {
        solution();   
    }

    /**
     * solution
     *
     * @param s
     */
    public static void print(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

    /**
     * In the print method, display the passed string 4 times. Each time, on a new line.
     * 요구 사항:
     * The program should display text on the screen.
     * The main method should not call System.out.println or System.out.print.
     * The print method should display the text on the screen.
     * The main method should call the Solution class's print method exactly three times.
     * The print method should display the string 4 times. Each time, on a new line.
     */
    private static void solution() {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }
}

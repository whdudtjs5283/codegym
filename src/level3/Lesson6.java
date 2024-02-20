package level3;

/**
 * CodeGym / Java Course / 자바 구문 / 작업
 * 레벨 3, 레슨 6
 */
public class Lesson6 {
    public static void main(String[] args) {
//        solution1();
        solution2();
    }

    /**
     * Display a 10 x 10 multiplication table in the following form:
     * 1 2 3 4 …
     * 2 4 6 8 …
     * 3 6 9 12 …
     * 4 8 12 16 …
     * …
     *
     * 요구 사항:
     * •	The program should output text.
     * •	The displayed text should contain 10 lines.
     * •	Each displayed string must contain 10 numbers separated by spaces.
     * •	The displayed numbers must form a multiplication table.
     */
    private static void solution2() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    /**
     * Display all possible combinations of the words "Sam", "I", "Am".
     *
     * Hint: there are 6 combinations.
     * Display each combination on a new line. Do not separate the words.
     *
     * Consider this example:
     * IAmSam
     * AmSamI
     * ...
     * 요구 사항:
     * •	The program should output text.
     * •	The displayed text should contain 6 lines.
     * •	The text on each line must be unique.
     * •	All possible combinations should be displayed.
     */
    private static void solution1() {
        String a = "I";
        String b = "Am";
        String c = "Sam";

        System.out.println(a + b + c);
        System.out.println(b + a + c);
        System.out.println(b + c + a);
        System.out.println(a + c + b);
        System.out.println(c + a + b);
        System.out.println(c + b + a);
    }
}
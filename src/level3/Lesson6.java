package level3;

/**
 * CodeGym / Java Course / 자바 구문 / 작업
 * 레벨 3, 레슨 6
 */
public class Lesson6 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
        solution3();
    }

    /**
     * solution3
     */
    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }

    /**
     * Create 7 objects to display the 7 colors of the rainbow on the screen.
     * Example output:
     * Red
     * Orange
     * Yellow
     * Green
     * Blue
     * Indigo
     * Violet
     * Each object displays a specific color when it is created.
     * 요구 사항:
     * •	The program should output text.
     * •	You need to create 7 different objects responsible for the colors.
     * •	The order in which the objects are created must correspond to the order of the colors in the rainbow.
     * •	Don't change the classes responsible for the colors.
     * •	The displayed text must match the task conditions.
     */
    private static void solution3() {
        Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Indigo Indigo = new Indigo();
        Violet violet = new Violet();
    }

    /**
     * Display a 10 x 10 multiplication table in the following form:
     * 1 2 3 4 …
     * 2 4 6 8 …
     * 3 6 9 12 …기
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

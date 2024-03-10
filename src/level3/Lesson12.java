package level3;

import java.io.*;

/**
 * CodeGym / Java Course / 자바 구문 / 추가 작업
 * 레벨 3, 레슨 12
 */
public class Lesson12 {
    public static void main(String[] args) throws IOException {
//        solution1();
//        solution2();
        solution3();
    }

    /**
     * Use the keyboard to enter the number n.
     * Display the phrase "I will earn $n per hour" on the screen.
     *
     * For example:
     * I will earn $100 per hour
     * 요구 사항:
     * •	The program should output text.
     * •	The program must read data from the keyboard.
     * •	The displayed text must contain the entered number n.
     * •	The displayed text must fully match the task conditions.
     */
    private static void solution3() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNumber = bufferedReader.readLine();
        int number = Integer.parseInt(sNumber);

        System.out.println("I will earn $" + number + " per hour");
    }

    /**
     * Display ten times the phrase "I want a big salary, and that's why I'm studying Java"
     * 요구 사항:
     * •	The program must not read data from the keyboard.
     * •	The program should output text.
     * •	The text should begin with "I want".
     * •	The text should end with "studying Java".
     * •	The text should consist of 10 lines.
     * •	The displayed text must match the task conditions.
     */
    private static void solution2() {
        for (int i=0; i < 10; i++) {
            System.out.println("I want a big salary, and that's why I'm studying Java");
        }
    }

    /**
     * solution1
     * @param number
     * @return
     */
    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        String sInt = String.valueOf(number);
        for (int i=0; i < sInt.length(); i++) {
            sum += Character.getNumericValue(sInt.charAt(i));
        }
        return sum;
    }

    /**
     * Write the code for sumDigitsInNumber(int number). The method takes a three-digit whole number. You need to calculate the sum of the digits of this number, and then return the result.
     *
     * Consider this example:
     * The sumDigitsInNumber method is called with the argument 546.
     *
     * Example output:
     * 15
     * 요구 사항:
     * •	The program must not read data from the keyboard.
     * •	The sumDigitsInNumber(int) method must be public and static.
     * •	The sumDigitsInNumber method must return an int.
     * •	The sumDigitsInNumber method should not display anything.
     * •	The sumDigitsInNumber method must return the sum of all digits in the parameter number.
     */
    private static void solution1() {
        System.out.println(sumDigitsInNumber(546));
    }
}

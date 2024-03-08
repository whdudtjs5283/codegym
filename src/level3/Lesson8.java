package level3;

import java.io.*;

/**
 * CodeGym / Java Course / 자바 구문 / 숫자를 입력하세요
 * 레벨 3, 레슨 8
 */
public class Lesson8 {
    public static void main(String[] args) throws IOException {
//        solution1();
//        solution2();
//        solution3();
//        solution4();
//        solution5();
        solution6();
    }

    /**
     * Use the keyboard to enter three names, then display:
     * name1 + name2 + name3 = Pure love. Ooo la-la!
     *
     * For example:
     * Kevin + Eva + Angelica = Pure love. Ooo la-la!
     * 요구 사항:
     * •	The program should output text.
     * •	The program must read data from the keyboard.
     * •	The displayed text must contain the entered name1.
     * •	The displayed text must contain the entered name2.
     * •	The displayed text must contain the entered name3.
     * •	The displayed text must fully match the task conditions.
     */
    private static void solution6() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Pure love. Ooo la-la!");
    }

    /**
     * Use the keyboard to enter a name and display the following:
     * <name> makes $120,000 a year. Ha-ha-ha!
     *
     * For example:
     * Sara makes $120,000 a year. Ha-ha-ha!
     * 요구 사항:
     * •	The program should output text.
     * •	The program must read data from the keyboard.
     * •	The displayed text must contain the entered name.
     * •	The displayed text must fully match the task conditions.
     */
    private static void solution5() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();

        System.out.println(name + " makes $120,000 a year. Ha-ha-ha!");
    }

    /**
     * Use the keyboard to separately enter the name, number1, and number2.
     * Display the following phrase:
     * <name> will receive <number1> in <number2> years.
     *
     * Here's an example:
     * Nick will receive 10000 in 5 years.
     * 요구 사항:
     * •	The program should output text.
     * •	The program must read data from the keyboard.
     * •	The displayed text must contain the entered name.
     * •	The displayed text must contain the entered number1.
     * •	The displayed text must contain the entered number2.
     * •	The displayed text must fully match the task conditions.
     */
    private static void solution4() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String sNumber1 = bufferedReader.readLine();
        int number1 = Integer.parseInt(sNumber1);
        String sNumber2 = bufferedReader.readLine();
        int number2 = Integer.parseInt(sNumber2);

        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }

    /**
     * Enter the number and name from the keyboard. Display the following string:
     * <name> will take over the world in <number> years. Mwa-ha-ha!
     *
     * Here's an example:
     * Kevin will take over the world in 8 years. Mwa-ha-ha!
     *
     * The order in which the data is input matters a lot.
     * 요구 사항:
     * •	The program should output text.
     * •	The program must read data from the keyboard.
     * •	The displayed text must contain the entered name.
     * •	The displayed text must contain the entered number.
     */
    private static void solution3() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNumber = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int number = Integer.parseInt(sNumber);

        System.out.println(name + " will take over the world in " + number + " years. Mwa-ha-ha!");
    }

    /**
     * Write code that calculates how many seconds have passed since 3:00 PM when the clock says it's 3:30 PM. Display the result.
     * 요구 사항:
     * •	The program should output text.
     * •	The displayed text should be a positive integer.
     * •	The displayed number must be a multiple of 60.
     * •	The displayed number must match the task conditions.
     */
    private static void solution2() {
        int secondsAfter3pm = 60 * 30; // second + minute
        System.out.println(secondsAfter3pm);
    }

    /**
     * solution1
     * @param inches
     * @return
     */
    public static int getFeetFromInches(int inches) {
        return inches / 12;
    }

    /**
     * Implement the getFeetFromInches(int inches) method. The method takes the number of inches. Your task is to make the method return the number of full feet represented by the variable inches. (1 feet = 12 in).
     *
     * Consider this example:
     * The getFeetFromInches method is called with the argument 243.
     *
     * Example output:
     * 20
     * 요구 사항:
     * •	The getFeetFromInches(int) method must be public and static.
     * •	The getFeetFromInches method must return an int.
     * •	The getFeetFromInches method should not display anything.
     * •	The getFeetFromInches method must correctly return the number of full feet represented by the variable inches.
     */
    private static void solution1() {
        System.out.println(getFeetFromInches(243));
    }
}

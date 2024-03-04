package level3;

import java.io.*;
import java.util.Scanner;

/**
 * CodeGym / Java Course / 자바 구문 / 키보드 입력
 * 레벨 3, 레슨 7
 */
public class Lesson7 {
    public static void main(String[] args) throws IOException {
//        example1();
//        example2();
        example3();
    }

    /**
     * 더욱 콤팩트
     */
    private static void example3() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
    }

    /**
     * 이전 예제의 보다 간결한 버전:
     * @throws IOException
     */
    private static void example2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
    }

    /**
     * 키보드에서 문자열과 숫자 입력
     * @throws IOException
     */
    private static void example1() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //Read a string from the keyboard
        String sAge = bufferedReader.readLine(); //Read a string from the keyboard
        int nAge = Integer.parseInt(sAge); //Convert the string to a number.
    }
}

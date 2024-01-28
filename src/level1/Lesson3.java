package level1;

public class Lesson3 {

    public static int number = 25;

    public static void main(String[] args) {
        solution1_3();
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 메모리 주소 지정과 변수
     * 레벨 1, 레슨 3
     *
     * 변수 number가 주어집니다.
     * 이 변수의 제곱(number * number)을 출력하는 프로그램을 작성하십시오.
     * 요구 사항:
     * •	변수 number는 변경하지 마십시오. 변수의 값만 변경할 수 있습니다.
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	출력한 텍스트는 숫자여야 합니다.
     * •	출력한 텍스트는 변수 number의 제곱이어야 합니다.
     */
    private static void solution1_3() {
        System.out.println(number * number);
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 메모리 주소 지정과 변수
     * 레벨 1, 레슨 3
     *
     * int 변수 a와 b, 그리고 String 변수 s를 선언하십시오.
     * 변수를 선언한 줄에서 값을 즉시 지정하십시오.
     * 요구 사항:
     * •	int 변수를 두 개 선언하십시오.
     * •	String 변수 하나를 선언하십시오.
     * •	int 변수는 a와 b라고 명명해야 합니다.
     * •	String 변수는 s로 명명해야 합니다.
     * •	변수에 값을 즉시 지정해야 합니다.
     * •	변수 a와 b의 값이 서로 달라야 합니다.
     */
    private static void solution1_2() {
        int a = 1;
        int b = 2;
        String s = "s";
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 메모리 주소 지정과 변수
     * 레벨 1, 레슨 3
     *
     * name이라는 String 변수를 선언하십시오.
     * 변수를 선언하는 줄에서 그 변수에 값을 즉시 지정합니다.
     * 변수 name을 화면에 출력합니다.
     * 요구 사항:
     * •	main 메소드에서 String 변수를 선언합니다.
     * •	변수의 이름을 name으로 지정해야 합니다.
     * •	변수에 값을 즉시 지정해야 합니다.
     * •	프로그램은 텍스트를 화면에 출력해야 합니다.
     * •	출력 텍스트는 변수의 값이어야 합니다.
     */
    private static void solution1_1() {
        String name = "코드짐";
        System.out.println(name);
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 메모리 주소 지정과 변수
     * 레벨 1, 레슨 3
     *
     * a와 b라는 int 변수를 선언하십시오.
     * 변수를 선언한 바로 그 줄에서 선언한 변수에 즉시 값을 지정합니다.
     * 변수 값은 정수면 됩니다.
     * 요구 사항:
     * •	int 변수를 두 개 선언하십시오.
     * •	변수의 이름은 a와 b가 되어야 합니다.
     * •	변수에 값을 즉시 지정해야 합니다.
     * •	변수 a와 b의 값이 서로 달라야 합니다.
     */
    private static void solution1() {
        int a = 1;
        int b = 2;
    }
}

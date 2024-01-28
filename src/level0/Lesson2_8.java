package level0;

/**
 * CodeGym 과제
 */
public class Lesson2_8 {
    public static void main(String[] args) {
        solution4_3();
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 레벨 0 요약
     * 레벨 0, 레슨 8
     *
     * 몇 줄을 코멘트로 처리하여
     * 2 더하기 3은 5입니다를
     * 화면에 출력하십시오.
     *
     * 메모: 변수를 선언한 줄을 코멘트로 처리하지 마십시오.
     * 요구 사항:
     * •	프로그램이 "2 더하기 3은 5입니다"를 화면에 출력해야 합니다.
     * •	변수를 선언하는 줄을 변경하지 마십시오.
     * •	적어도 한 줄은 코멘트로 처리해야 합니다.
     * •	출력을 담당하는 명령을 변경하거나 추가하지 마십시오. 출력 명령을 코멘트로 처리할 수 있습니다.
     */
    public static void solution4_3() {
        int a = 3;
        int b = 2;

        // System.out.print("둘");
        System.out.print(b);
        System.out.print(" 더하기 ");
        // System.out.print(" 빼기 ");
        System.out.print(a);
        // System.out.print("셋");
        // System.out.print("은 ");
        System.out.print("은 ");
        // System.out.print("다섯입니다");
        System.out.print((a + b) + "입니다");
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 레벨 0 요약
     * 레벨 0, 레슨 8
     *
     * 해당 줄에 코멘트를 제거하면 프로그램은 12 및 2를 출력합니다(12를 먼저 출력한 후에 2 출력).
     * 요구 사항:
     * •	프로그램이 숫자 12와 2를 출력해야 합니다.
     * •	변수를 선언하는 줄은 변경하지 마십시오.
     * •	프로그램에는 int 변수 두 개만 있어야 합니다.
     * •	화면 출력을 담당하는 줄을 변경하지 마십시오
     * •	한 줄은 코멘트 처리를 제거하고 나머지 줄은 그대로 두어야 합니다.
     */
    public static void solution4_2() {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 레벨 0 요약
     * 레벨 0, 레슨 8
     *
     * "버그가 아니라 기능입니다."를 출력하는 프로그램을 작성하십시오.
     *
     * 예제 출력:
     * 버그가 아니라 기능입니다.
     * 요구 사항:
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	"버그가 아니라"라는 문구로 텍스트를 시작해야 합니다.
     * •	텍스트를 마침표로 끝내야 합니다.
     * •	텍스트는 스페이스와 구두점을 포함하여 32자로 구성해야 합니다.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    public static void solution4_1() {
        System.out.println("버그가 아니라 기능입니다.");
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 엘리, 변수, 데이터 유형
     * 레벨0, 레슨4
     *
     * main 메소드에서 다음 변수들을 선언하는 프로그램을 작성하십시오.
     * String name, int age, String city.
     *
     * 메모: "변수 선언"과 "변수 생성"은 같은 말입니다.
     * 요구 사항:
     * •	name이라는 String 변수를 선언하십시오.
     * •	age라는 int 변수를 선언하십시오.
     * •	city라는 String 변수를 선언하십시오.
     * •	변수를 3개 선언해야 합니다.
     */
    public static void solution3_3() {
        String name;
        int age;
        String city;
    }


    /**
     * CodeGym / Java Course / 자바 구문 / 엘리, 변수, 데이터 유형
     * 레벨0, 레슨4
     *
     * 지금은 3126년도입니다. 내 친구는 8년 전에 출생했습니다.
     * 내 친구의 출생 년도를 출력하는 프로그램을 작성하십시오.
     * 요구 사항:
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	출력한 년도는 4 자릿수이어야 합니다.
     * •	출력한 년도는 "31"로 시작해야 합니다.
     * •	출력한 년도는 과제 조건과 일치해야 합니다.
     */
    public static void solution3_2() {
        int nowYear = 3126;
        int bornBeforeYear = 8;
        System.out.println(nowYear - bornBeforeYear);
    }


    /**
     * CodeGym / Java Course / 자바 구문 / 엘리, 변수, 데이터 유형
     * 레벨 0, 레슨 4
     * "엘리 선생님은 명석합니다"라는 문구를 5번 출력하는 프로그램을 작성해 보십시오. 매번 새 줄에 출력합니다.
     *
     * 예제 출력:
     * 엘리 선생님은 명석합니다
     * 엘리 선생님은 명석합니다
     * 엘리 선생님은 명석합니다
     * 엘리 선생님은 명석합니다
     * 엘리 선생님은 명석합니다
     * 요구 사항:
     * 텍스트를 출력하는 프로그램이어야 합니다.
     * "엘리 선생님은"이라는 문구로 텍스트를 시작해야 합니다.
     * "명석합니다"라는 문구로 텍스트를 끝내야 합니다.
     * 텍스트를 5 줄로 출력해야 합니다.
     * 출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    public static void solution3_1 () {
        String s = "엘리 선생님은 명석합니다";
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 첫 번째 프로그램 준비 완료
     * 레벨0, 레슨3
     *
     * 다음 문구를 출력하는 프로그램을 작성하십시오. "프로그래머가 되는 것은 멋진 일이라고 생각합니다".
     *
     * 예제 출력:
     * 프로그래머가 되는 것은 멋진 일이라고 생각합니다
     * 요구 사항:
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	"프로그래머가"라는 문구로 텍스트를 시작해야 합니다.
     * •	"생각합니다."라는 문구로 텍스트를 끝내야 합니다.
     * •	텍스트는 스페이스와 구두점을 포함하여 34개의 문자로 구성합니다.
     * •	텍스트를 한 줄로 출력해야 합니다.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    public static void solution2() {
        System.out.print("프로그래머가 ");
        System.out.print("되는 것은 ");
        System.out.print("멋진 ");
        System.out.print("일이라고 ");
        System.out.print("생각합니다");
    }

    /**
     * CodeGym / Java Course / 자바 구문 / 가상 머신과 첫 명령어
     * 레벨0, 레슨2
     *
     * 다음 문구를 출력하는 프로그램을 작성하십시오. "아미고는 아주 영리하다".
     *
     * 예제 출력:
     * 아미고는 아주 영리하다
     * 요구 사항:
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	"아미고"라는 문구로 텍스트를 시작해야 합니다.
     * •	"영리하다"라는 문구로 텍스트를 끝내야 합니다.
     * •	텍스트는 공백을 포함하여 19자로 구성되어야 합니다.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    public static void solution1() {
        System.out.println("아미고는 아주 영리하다");
    }
}
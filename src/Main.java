import java.sql.SQLOutput;

/**
 * CodeGym 과제
 */
public class Main {
    public static void main(String[] args) {
        solution3_3();
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
     *
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
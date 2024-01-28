package level1;

/**
 * CodeGym / Java Course / 자바 구문 / 정수와 문자열 소개
 * 레벨 1, 레슨 4
 */
public class Lesson4 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
//        solution3();
//        solution4();
//        solution5();
//        solution6();
        solution7();
    }

    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    /**
     * main 메소드에서 변수 result가 20이 되도록 더하기와 빼기 기호를 올바르게 배치하십시오.
     * 변수 result가 선언된 줄에만 부호를 배치해야 합니다.
     * 이 줄에서 변수의 순서를 변경하지 마십시오.각 변수 앞에는 더하기
     * 또는 빼기 부호가 와야 합니다.
     * 요구 사항:
     * •	변수 값 a, b, c, d를 변경하지 마십시오.
     * •	변수 result를 선언한 줄에서 각 변수(a, b, c, d) 앞에는 더하기 또는 빼기 부호가 와야 합니다.
     * •	이 프로그램은 화면에 숫자 20을 출력해야 합니다.
     * •	더하기나 빼기 부호를 올바르게 배치해야 합니다.
     */
    private static void solution7() {
        int result = - a + b - c + d;

        System.out.println(result);
    }

    /**
     * 변수 age의 값이 15가 되도록 프로그램을 변경하십시오.
     * 요구 사항:
     * •	변수를 네 개 선언해야 합니다.
     * •	변수 age는 int가 되어야 합니다.
     * •	모든 변수는 선언 된 직후에 값을 지정해야 합니다.
     * •	변수 age에 지정한 값은 15가 되어야 합니다.
     */
    private static void solution6() {
        String name = "아미고";
        int age = 15;
        int money = 500;
        int weight = 70;
    }

    /**
     * "sum = 12"가 화면에 나타나도록 일부 코드를 코멘트 처리하십시오.
     * 요구 사항:
     * •	프로그램은 텍스트를 출력해야 합니다.
     * •	코멘트 처리가 필요한 줄은 코멘트 처리하고 나머지 줄은 그대로 두어야 합니다.
     * •	프로그램에 새 줄을 추가하거나 기존 줄을 삭제하지 마십시오.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    private static void solution5() {
        int a = 3;
        // int a = 10;
        int b = 6;
        // int b = 12;
        // int sum = 1 + a + b;
        // int sum = 2 + a + b;
        int sum = 3 + a + b;
        // int sum = 4 + a + b;

        System.out.println("sum = " + sum);
    }

    /**
     * 다음 텍스트를 출력하도록 프로그램을 변경하십시오.
     * 자바로 코드 작성
     * 변수를 사용하십시오.
     * 요구 사항:
     * •	변수를 세 개 선언해야 합니다.
     * •	모든 변수는 선언 된 직후에 값을 지정해야 합니다.
     * •	화면 출력 명령을 변경할 수 없습니다.
     * •	"자바로 코드 작성"을 출력하는 프로그램이어야 합니다.
     */
    private static void solution4() {
        String s1 = "파스칼";
        s1 = "자바";
        String s2 = "로";
        String s3 = "코드 작성";
        System.out.println(s1 + s2 + " " + s3);
    }

    /**
     * 변수 name에 값 "아미고"를 지정하도록 프로그램을 변경하십시오.
     * 요구 사항:
     * •	변수 이름은 선언 된 직후에 값을 지정해야 합니다.
     * •	변수를 두 개 선언해야 합니다.
     * •	변수 텍스트의 값은 변경할 수 없습니다.
     * •	화면 출력 명령을 변경할 수 없습니다.
     * •	"안녕, 아미고!"를 출력하는 프로그램이어야 합니다.
     */
    private static void solution3() {
        String name = "엘리 선생님";
        name = "아미고";
        String text = "안녕하세요, " + name + "!";
        System.out.println(text);
    }

    /**
     * 코드에서 일부 코멘트를 제거해 "새해 복 많이 받으세요"를 화면에 출력하십시오.
     * 요구 사항:
     * •	프로그램은 텍스트를 출력해야 합니다.
     * •	몇 줄은 코멘트 처리를 제거해야 합니다. 다른 것은 변경하지 마십시오.
     * •	프로그램에 새 줄을 추가하거나 기존 줄을 삭제하지 마십시오.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    private static void solution2() {
//        String s = "즐거운";
//        System.out.println("크리스마스 보내세요");
//        System.out.println("보람찬 새해");
//        System.out.print("주말 보내세요");
        System.out.print("새해 복 많이");
//        System.out.print("주말 보내세요");
//        System.out.println(s);
//        System.out.print("보람찬 새해되세요!");
        System.out.print(" ");
        System.out.println("받으세요");
    }

    /**
     * 다음 문구를 출력하는 프로그램을 작성하십시오. "CodeGym. 한 번 배우면 어디에서나 사용" 10번.
     * 요구 사항:
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	"CodeGym"이라는 문구로 텍스트를 시작해야 합니다.
     * •	"어디에서나 사용"이라는 문구로 텍스트를 끝내야 합니다.
     * •	텍스트는 10줄로 구성되어야 합니다.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    private static void solution1() {
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
        System.out.println("CodeGym. 한 번 배우면 어디에서나 사용");
    }
}

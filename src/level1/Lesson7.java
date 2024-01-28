package level1;

/**
 * CodeGym / Java Course / 자바 구문 / print()와 println();
 * 레벨 1, 레슨 7
 */
public class Lesson7 {
    public static void main(String[] args) {
//        solution1();
        solution2();
    }

    /**
     * 전혀 사용되지 않은 변수는 코멘트 처리하십시오. 프로그램은 컴파일 되어야 합니다.
     * 요구 사항:
     * •	변수 유형을 변경하지 마십시오.
     * •	변수 값을 변경하지 마십시오.
     * •	프로그램에 새 줄을 추가하거나 기존 줄을 삭제하지 마십시오.
     * •	사용하지 않은 변수를 코멘트 처리해야 합니다.
     * •	프로그램의 출력을 변경하지 않아야 합니다.
     */
    private static void solution2() {
        int a = 10;
        int b = 15;
        double c = b + 38;
        // int d = a + 12;
        // double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        // String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }

    /**
     * 프로그램에서 버그를 수정하십시오. 숫자 100을 출력하는 프로그램이어야 합니다.
     * 요구 사항:
     * •	프로그램은 텍스트를 출력해야 합니다.
     * •	변수를 세 개 선언해야 합니다.
     * •	변수 유형을 변경하지 마십시오.
     * •	변수 값을 변경하지 마십시오.
     * •	프로그램에 새 줄을 추가하거나 기존 줄을 삭제하지 마십시오.
     * •	화면 출력 명령을 가능한 적게 변경하십시오.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    private static void solution1() {
        int a = 56;
        int b = 30;
        int c = 14;
        System.out.print(a + b + c);
    }
}

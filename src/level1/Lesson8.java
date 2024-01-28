package level1;

/**
 * CodeGym / Java Course / 자바 구문 / 파스칼과 비교
 * 레벨 1, 레슨 8
 */
public class Lesson8 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
//        solution3();
//        solution4();
//        solution5();
        solution6();
    }

    /**
     * main 메소드에서 좋아하는 시를 출력하는 프로그램을 작성하십시오.
     * 출력할 시가 4줄 이상은 되어야 합니다. "좋아하는 시:"를 표시하는 줄을 제거하지 마십시오.
     * 요구 사항:
     * 텍스트를 출력하는 프로그램이어야 합니다.
     * "좋아하는 시:" 줄은 시의 구절 앞에 출력해야 합니다.
     * 표시된 텍스트는 최소한 5줄이 되어야 합니다(빈 줄도 줄입니다).
     * 출력한 텍스트는 50자 이상이어야 합니다.
     */
    private static void solution6() {
        System.out.println("좋아하는 시:");
        System.out.println("호수 / 정지용");
        System.out.println();
        System.out.println("얼굴 하나야");
        System.out.println("손가락 둘로");
        System.out.println("푹 가리지만");
        System.out.println();
        System.out.println("보고싶은 마음");
        System.out.println("호수만 하니");
        System.out.println("눈 감을 수 밖에");
    }

    /**
     * 값이 과일 이름인 변수를 출력합니다. 변수를 각각 새 줄에 출력하십시오.
     * 요구 사항:
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	변수를 선언하는 줄은 변경하지 마십시오.
     * •	출력된 텍스트는 2 줄로 구성되어야 합니다.
     * •	값이 과일 이름인 변수를 출력하는 프로그램이어야 합니다.
     * •	프로그램에서 값이 과일 이름이 아닌 변수는 출력하지 않아야 합니다.
     */
    private static void solution5() {
        String apple = "사과";
        String porridge = "오트밀 죽";
        String sausage = "소시지";
        String peach = "배";

        System.out.println(apple);
        System.out.println(peach);
    }

    /**
     * solution4
     *
     * @param a
     * @param b
     */
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.print(c);
    }

    /**
     * 2와 2를 인수로 sum 메소드를 호출하는 프로그램을 작성하십시오.
     * 요구 사항:
     * •	숫자 2와 2를 더한 합을 출력하는 프로그램을 작성해야 합니다.
     * •	main 메소드에서 2와 2를 인수로 sum 메소드를 호출해야 합니다.
     * •	main 메소드에서 화면 출력 메소드를 호출하지 않아야 합니다.
     * •	sum 메소드를 변경하지 마십시오.
     */
    private static void solution4() {
        sum(2, 2);
    }


    /**
     * solution3
     *
     * @param a
     * @return
     */
    public static int sqr(int a) {
        return a * a;
    }

    /**
     * 화면에 5의 제곱을 출력하는 프로그램을 작성하십시오.
     * 요구 사항:
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	main 메소드에서 5를 인수로 하여 sqr 메소드를 호출해야 합니다.
     * •	sqr 메소드에서 얻은 결과를 main 메소드에서 출력해야 합니다.
     * •	sqr 메소드를 변경하지 마십시오.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    private static void solution3() {
        System.out.println(sqr(5));
    }

    /**
     * 다음 문구를 출력하는 프로그램을 작성하십시오. "내키면 작업한다. 내키지 않아도 어쨌든 작업한다"를16번출력합니다.
     * 요구 사항:
     * •	텍스트를 출력하는 프로그램이어야 합니다.
     * •	'내키면'이라는 문구로 텍스트를 시작해야 합니다.
     * •	'작업한다'라는 문구로 텍스트를 끝내야 합니다.
     * •	텍스트는 16줄로 구성되어야 합니다.
     * •	출력한 텍스트는 과제 조건과 일치해야 합니다.
     */
    private static void solution2() {
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
        System.out.println("내키면 작업한다. 내키지 않아도 어쨌든 작업한다");
    }

    /**
     * 누락 된 변수를 선언하고 전혀 사용되지 않은 변수를 코멘트 처리하십시오.
     * 요구 사항:
     * •	프로그램은 텍스트를 출력해야 합니다.
     * •	변수를 네 개 선언해야 합니다.
     * •	사용하지 않은 변수를 코멘트 처리해야 합니다.
     * •	프로그램의 출력을 변경하지 않아야 합니다.
     */
    private static void solution1() {
        // String s = "15";
        int a = 5;
        // int z = 18;
        int d = 18;
        int c = a + d;
        String b = "보다 나은 건 ";

        System.out.println(c + b + a);
    }
}

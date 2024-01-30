package level2;

/**
 * CodeGym / Java Course / 자바 구문 / 기본 데이터 유형
 * 레벨 2, 레슨 2
 */
public class Lesson2 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
//        solution3();
//        solution4();
//        solution5();
        solution6();
    }

    /**
     * In the main method, declare two int variables a and b.
     * Assign them any values.
     * Display their sum and product on the screen.
     * Display each value on a new line.
     *
     * Example output for a = 5, b = 7:
     * 12
     * 35
     * 요구 사항:
     * •	The program should display text on the screen.
     * •	The program should have two int variables a and b.
     * •	The variables must be immediately assigned values.
     * •	The main method should display the sum of the variables a and b.
     * •	The main method should display the product of the variables a and b.
     * •	Each value should be displayed on a new line.
     */
    private static void solution6() {
        int a = 5;
        int b = 7;

        System.out.println(a + b);
        System.out.println(a * b);
    }

    /**
     * solution5
     * @param a
     */
    public static void hackSalary(int a) {
        a += 1000;
        System.out.println("Your salary is: " + a + " dollars per month.");
    }

    /**
     * In the public static void hackSalary(int a) method, increase the salary by 1000 and display the following: "Your salary is: <a+1000> dollars per month."
     * where <a+1000> is the salary increased by 1000.
     *
     * Example output for a = 7000:
     * Your salary is: 8000 dollars per month.
     * 요구 사항:
     * •	The program should display text on the screen.
     * •	The main method should not call System.out.println or System.out.print.
     * •	The hackSalary method should not return a result.
     * •	The main method should call the hackSalary method only once.
     * •	The hackSalary method should increase the input parameter by 1000 and output text to the screen according to the specified template.
     */
    private static void solution5() {
        hackSalary(7000);
    }

    /**
     * solution4
     */
    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    /**
     * solution4
     */
    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }

    /**
     * In the main method, create a Man object and save a reference to it in the variable man.
     * Also, create a Woman object and save a reference to it in the variable woman.
     *
     * Hint: Use the following construct to create a Woman object and assign a reference to that object to the variable woman:
     * VariableType variableName = new TypeOfObjectBeingCreated();
     * Save a reference to the previously created Woman object in man.wife.
     * Save a reference to the previously created Man object in woman.husband (Hint: woman.husband = man).
     * 요구 사항:
     * •	In the main method, create a Man object and save a reference to it in the variable man.
     * •	In the main method, create a Woman object and save a reference to it in the variable woman.
     * •	In the main method, store a reference to the previously created Woman object in man.wife.
     * •	In the main method, store a reference to the previously created Man object in woman.husband.
     * •	The Man class must have 3 variables.
     * •	The Woman class must have 3 variables.
     */
    private static void solution4() {
        Man man = new Man();
        Woman woman = new Woman();

        man.wife = woman;
        woman.husband = man;
    }

    /**
     * solution3
     */
    public static class Person {
        String name;
        int age;
        int weight;
        int money;
    }

    /**
     * In the Person class, declare the following variables: String name, int age, int weight, int money.
     * In the main method, create a Person object and store a reference to it in the variable person.
     *
     * Hint: Use the following construct to create a Person object and assign a reference to that object to the variable person:
     * VariableType variableName = new TypeOfObjectBeingCreated();
     * 요구 사항:
     * •	In the Person class, declare a String variable called name.
     * •	In the Person class, declare an int variable called age.
     * •	In the Person class, declare an int variable called weight.
     * •	In the Person class, declare an int variable called money.
     * •	In the main method, create a Person object and immediately assign a reference to it to the variable person.
     * •	Five variables must be declared.
     */
    private static void solution3() {
        Person person = new Person();
    }

    /**
     * solution2
     *
     * @param celsius
     * @return
     */
    public static double convertCelsiusToFahrenheit(int celsius) {
        double tf = (9/5.0) * celsius + 32;

        return tf;
    }

    /**
     * The convertCelsiusToFahrenheit(int celsius) method accepts a value in degrees Celsius. The method should convert the temperature and return the value in degrees Fahrenheit.
     * The Celsius temperature (TC) and the Fahrenheit temperature (TF) are related by the following relationship:
     * TF = (9 / 5) * TC + 32.
     *
     * Consider this example:
     * A value of 41 is passed to the convertCelsiusToFahrenheit method.
     *
     * Example output:
     * 105.8
     * 요구 사항:
     * •	The convertCelsiusToFahrenheit(int) method must be public and static.
     * •	The convertCelsiusToFahrenheit method must return a double.
     * •	The convertCelsiusToFahrenheit method should not display anything.
     * •	The convertCelsiusToFahrenheit method must correctly convert degrees Celsius to degrees Fahrenheit and return the result.
     */
    private static void solution2() {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    /**
     * solution1
     *
     * @param radius
     */
    public static void printCircleCircumference(int radius) {
        double c  = 2 * 3.14 * radius;
        System.out.println(c);
    }

    /**
     * Display the circumference of a circle, which is calculated using the formula: C = 2 * pi * radius.
     * The result is a fractional number (double).
     * Use 3.14 as the value of pi.
     * 요구 사항:
     * •	In the printCircleCircumference method, you need to display the circle circumference, which is calculated using the formula: 2 * pi * radius.
     * •	The main method should call the printCircleCircumference method with 5 as an argument.
     * •	The main method should not call a screen output method.
     * •	The program should display the circumference of a circle with a radius of 5.
     */
    private static void solution1() {
        printCircleCircumference(5);
    }
}

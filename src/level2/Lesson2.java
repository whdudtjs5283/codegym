package level2;

/**
 * CodeGym / Java Course / 자바 구문 / 기본 데이터 유형
 * 레벨 2, 레슨 2
 */
public class Lesson2 {
    public static void main(String[] args) {
//        solution1();
//        solution2();
        solution3();
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

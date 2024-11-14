import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstNumber = in.nextDouble();
        System.out.println("Введите второе число: ");
        double secondNumber = in.nextDouble();
        System.out.println("Выберите один из операторов: +, -, *, /");
        String operator = in.next();
        solution(firstNumber, secondNumber, operator);
    }

    public static void solution(double firstNumber, double secondNumber, String operator){

        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("Ваш результат: " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("Ваш результат: " + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("Ваш результат: " + result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println("Ваш результат: " + result);
                break;
            default:
                System.out.println("Выберите верный оператор");
                break;
        }
    }
}
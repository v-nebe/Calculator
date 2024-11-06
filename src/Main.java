import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = in.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();
        System.out.println("Выберите один из операторов: +, -, *, /");
        String operator = in.next();
        solution(firstNumber, secondNumber, operator);
    }

    public static int solution(int firstNumber, int secondNumber, String operator){
        int result = 0;

        if(Objects.equals(operator, "+")){
            result = firstNumber + secondNumber;
        } else if (Objects.equals( operator, "-") ) {
            result = firstNumber - secondNumber;
        } else if (Objects.equals(operator, "*")) {
            result = firstNumber * secondNumber;
        } else if (Objects.equals(operator, "/")) {
            result = firstNumber / secondNumber;
        }else{
            System.out.println("Выберите верный оператор");
        }
        System.out.println("Ваш результат: " + result);
        return result;
    }
}
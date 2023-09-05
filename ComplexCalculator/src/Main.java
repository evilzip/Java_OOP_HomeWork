import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Logging log=new Logging("cal_log.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор комплексных чисел");
        System.out.println("Введите первое комплексное число:");
        ComplexNumber number1 = readComplexNumber(scanner);
        log.log("Первое число: " + number1);

        System.out.println("Введите второе комплексное число:");
        ComplexNumber number2 = readComplexNumber(scanner);
        log.log("Второе число: " + number2);

        System.out.println("Выберите операцию: ");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                ComplexNumber sum = number1.add(number2);
                System.out.println("Результат сложения: " + sum.toString());
                log.log("Результат сложения: " + sum.toString());
                break;
            case 2:
                ComplexNumber difference = number1.subtract(number2);
                System.out.println("Результат вычитания: " + difference.toString());
                log.log("Результат вычитания: " +  difference.toString());
                break;
            case 3:
                ComplexNumber product = number1.multiply(number2);
                System.out.println("Результат умножения: " + product.toString());
                log.log("Результат умножения: " + product.toString());
                break;
            case 4:
                ComplexNumber quotient = number1.divide(number2);
                System.out.println("Результат деления: " + quotient.toString());
                log.log("Результат деления: " + quotient.toString());
                break;
            default:
                System.out.println("Некорректный выбор операции");
                log.log("Некорректный выбор операции");
                break;
        }
    }

    /**
     * Метод для чтения комплексного числа из консоли
     */
    public static ComplexNumber readComplexNumber(Scanner scanner) {
        System.out.print("Введите действительную часть числа: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимую часть числа: ");
        double imaginary = scanner.nextDouble();

        return new ComplexNumber(real, imaginary);
    }
}
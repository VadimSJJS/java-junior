package strategy.calculator;

/*
Калькулятор с разными операциями

Задача:
Создайте калькулятор, который может выполнять разные арифметические операции (+, -, *, /) с помощью паттерна Стратегия.

Структура:

    Интерфейс MathOperation с методом execute(a, b).

    Классы-стратегии: Add, Subtract, Multiply, Divide.

    Класс Calculator (Контекст), который использует выбранную стратегию.
 */

class Add implements MathOperation {
    @Override
    public double execute(double a, double b) {
        System.out.println(a + b);
        return a + b;
    }
}

class Subtract implements MathOperation {
    @Override
    public double execute(double a, double b) {
        System.out.println(a - b);
        return a - b;
    }
}

class Multiply implements MathOperation {
    @Override
    public double execute(double a, double b) {
        System.out.println(a * b);
        return a * b;
    }
}

class Divide implements MathOperation {
    @Override
    public double execute(double a, double b) {
        System.out.println(a / b);
        return a / b;
    }
}

class Calculator {
    private MathOperation mathOperation;

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void execute(double a, double b) {
        mathOperation.execute(a, b);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setMathOperation(new Add());
        calculator.execute(5.5, 3.21);

        calculator.setMathOperation(new Subtract());
        calculator.execute(12.2, 3.1);

        calculator.setMathOperation(new Multiply());
        calculator.execute(5.31, 3.312);

        calculator.setMathOperation(new Divide());
        calculator.execute(2.5, 3.3);
    }
}

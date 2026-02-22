package es.ulpgc;

public class Calculator {
    public double calculateSum(Operation operation, double a, double b) {
        if (operation == Operation.ADD) {
            return a + b;
        }
    }

    public double calculateSubtraction(Operation operation, double a, double b) {
        if (operation == Operation.SUBTRACT) {
            return a - b;
        }
    }

    public double calculateMultiplication(Operation operation, double a, double b) {
        if (operation == Operation.MULTIPLY) {
            return a * b;
        }
    }

    public double calculateDivision(Operation operation, double a, double b) {
        if (operation == Operation.DIVIDE) {
            if (b != 0) {
                return a / b;
            } else {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
    }
}

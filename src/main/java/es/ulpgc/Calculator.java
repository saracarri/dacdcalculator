package es.ulpgc;

public class Calculator {

    public double add(String expression) {
        if (!expression.contains("+")) {
            throw new IllegalArgumentException("Incorrect operator for add");
        }
        String[] parts = expression.split("\\+");
        double a = Double.parseDouble(parts[0].trim());
        double b = Double.parseDouble(parts[1].trim());
        return a + b;
    }

    public double subtract(String expression) {
        if (!expression.contains("-")) {
            throw new IllegalArgumentException("Incorrect operator for subtract");
        }
        String[] parts = expression.split("-");
        double a = Double.parseDouble(parts[0].trim());
        double b = Double.parseDouble(parts[1].trim());
        return a - b;
    }

    public double multiply(String expression) {
        if (!expression.contains("*")) {
            throw new IllegalArgumentException("Incorrect operator for multiply");
        }
        String[] parts = expression.split("\\*");
        double a = Double.parseDouble(parts[0].trim());
        double b = Double.parseDouble(parts[1].trim());
        return a * b;
    }

    public double divide(String expression) {
        if (!expression.contains("/")) {
            throw new IllegalArgumentException("Incorrect operator for divide");
        }
        String[] parts = expression.split("/");
        double a = Double.parseDouble(parts[0].trim());
        double b = Double.parseDouble(parts[1].trim());
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

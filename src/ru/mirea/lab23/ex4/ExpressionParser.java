package ru.mirea.lab23.ex4;

class ExpressionParser {
    private String expression;
    private int index;
    private char currentChar;

    public ExpressionParser(String expression) {
        this.expression = expression;
        this.index = 0;
        this.currentChar = getNextChar();
    }

    public Expression parse() {
        try {
            Expression result = parseExpression();
            if (index < expression.length()) {
                throw new IllegalArgumentException("Unexpected character: " + currentChar);
            }
            return result;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    private Expression parseExpression() {
        Expression result = parseTerm();
        while (currentChar == '+' || currentChar == '-') {
            char operation = currentChar;
            getNextChar();
            Expression right = parseTerm();
            if (operation == '+') {
                result = new Add(result, right);
            } else {
                result = new Subtract(result, right);
            }
        }
        return result;
    }

    private Expression parseTerm() {
        Expression result = parseFactor();
        while (currentChar == '*' || currentChar == '/') {
            char operation = currentChar;
            getNextChar();
            Expression right = parseFactor();
            if (operation == '*') {
                result = new Multiply(result, right);
            } else {
                result = new Divide(result, right);
            }
        }
        return result;
    }

    private Expression parseFactor() {
        if (currentChar == '-') {
            getNextChar();
            return new Subtract(new Const(0), parseFactor());
        } else if (currentChar == '(') {
            getNextChar();
            Expression result = parseExpression();
            if (currentChar != ')') {
                throw new IllegalArgumentException("Expected closing parenthesis, found: " + currentChar);
            }
            getNextChar();
            return result;
        } else if (Character.isDigit(currentChar)) {
            return parseNumber();
        } else if (Character.isLetter(currentChar)) {
            return parseVariable();
        } else {
            throw new IllegalArgumentException("Unexpected character: " + currentChar);
        }
    }

    private Expression parseNumber() {
        StringBuilder sb = new StringBuilder();
        while (Character.isDigit(currentChar)) {
            sb.append(currentChar);
            getNextChar();
        }
        try {
            return new Const(Integer.parseInt(sb.toString()));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format: " + sb.toString());
        }
    }

    private Expression parseVariable() {
        StringBuilder sb = new StringBuilder();
        while (Character.isLetter(currentChar)) {
            sb.append(currentChar);
            getNextChar();
        }
        return new Variable(sb.toString());
    }

    private char getNextChar() {
        if (index < expression.length()) {
            currentChar = expression.charAt(index++);
        } else {
            currentChar = '\0';
        }
        return currentChar;
    }
}



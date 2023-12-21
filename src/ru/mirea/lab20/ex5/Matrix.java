package ru.mirea.lab20.ex5;

public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int cols;

    public Matrix(T[][] data) {
        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new IllegalArgumentException("Invalid matrix data");
        }

        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrix dimensions do not match for addition");
        }

        T[][] resultData = createArray(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = addElements(data[i][j], other.data[i][j]);
            }
        }

        return new Matrix<>(resultData);
    }


    public Matrix<T> multiply(Matrix<T> other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException("Incompatible matrix dimensions for multiplication");
        }

        T[][] resultData = createArray(rows, other.cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                T sum = zeroElement();
                for (int k = 0; k < cols; k++) {
                    sum = addElements(sum, multiplyElements(data[i][k], other.data[k][j]));
                }
                resultData[i][j] = sum;
            }
        }

        return new Matrix<>(resultData);
    }

    private T[][] createArray(int rows, int cols) {
        return (T[][]) new Number[rows][cols];
    }

    private T addElements(T a, T b) {
        if (a instanceof Double || a instanceof Float) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        }
    }

    private T multiplyElements(T a, T b) {
        if (a instanceof Double || a instanceof Float) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        }
    }

    private T zeroElement() {
        if (data[0][0] instanceof Double || data[0][0] instanceof Float) {
            return (T) Double.valueOf(0);
        } else {
            return (T) Long.valueOf(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T[] row : data) {
            for (T element : row) {
                result.append(element).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}


/**
 * Класс комплексного числа c методами арифметических операций
 *
 */
class ComplexNumber {
    private double real; // действительная часть
    private double imaginary; // мнимая часть

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры и сеттеры

    /**
     * @return Метод возвращает действительную часть числа
     */
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    /**
     * @return возвращает мнимую часть числа
     */
    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * Метод для сложения комплексных чисел
     */
    public ComplexNumber add(ComplexNumber number) {
        double real = this.real + number.getReal();
        double imaginary = this.imaginary + number.getImaginary();

        return new ComplexNumber(real, imaginary);
    }

    /**
     * Метод для вычитания комплексных чисел
     */
    public ComplexNumber subtract(ComplexNumber number) {
        double real = this.real - number.getReal();
        double imaginary = this.imaginary - number.getImaginary();

        return new ComplexNumber(real, imaginary);
    }

    /**
     * Метод для умножения комплексных чисел
     */
    public ComplexNumber multiply(ComplexNumber number) {
        double real = this.real * number.getReal() - this.imaginary * number.getImaginary();
        double imaginary = this.real * number.getImaginary() + this.imaginary * number.getReal();

        return new ComplexNumber(real, imaginary);
    }

    /**
     * Метод для деления комплексных чисел
     */
    public ComplexNumber divide(ComplexNumber number) {
        double denominator = Math.pow(number.getReal(), 2) + Math.pow(number.getImaginary(), 2);
        double real = (this.real * number.getReal() + this.imaginary * number.getImaginary()) / denominator;
        double imaginary = (this.imaginary * number.getReal() - this.real * number.getImaginary()) / denominator;

        return new ComplexNumber(real, imaginary);
    }

    /**
     * @return отображение мнимого числа в классическом виде: реальная часть + мниманя*i
     */
    @Override
    public String toString() {
        return real + " + " + imaginary + "*i";
    }
}
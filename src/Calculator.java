public class Calculator {
    int num1;
    int num2;
    int result;
    int base;
    String resultNum;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        this.result = num1 + num2;
        return this.result;
    }

    public int subtract() {
        this.result = num1 - num2;
        return this.result;
    }

    public int multiply() {
        this.result = 0;
        for (int i = 0; i < num2; i++) {
            this.result += num1;
        }
        return this.result;
    }

    public int divide() {
        result = 0;
        for (int i = num1; i >= num2;) {
            i -= num2;
            result++;
        }
        return result;
    }

    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    public void displayConversionNum() {
        System.out.println(num1 + "의 " + num2 + "진수 값 = " + resultNum);
    }
}

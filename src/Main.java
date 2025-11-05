public class Main {
    public static void main(String[] args) {
        Calculator cale_add = new Calculator();
        cale_add.setNumbers(5, 3);
        cale_add.add();
        cale_add.displayResult("+");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10, 2);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        ScientificCalculator sc = new ScientificCalculator();
        sc.setNumbers(5, 3);
        sc.power();
        sc.displayResult("^");

        sc.setNumbers(40, 2);
        sc.conversionNum();
        sc.displayConversionNum();

        sc.setNumbers(40, 8);
        sc.conversionNum();
        sc.displayConversionNum();

        sc.setNumbers(40, 16);
        sc.conversionNum();
        sc.displayConversionNum();

    }
}
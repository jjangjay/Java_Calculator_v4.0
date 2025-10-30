public class ScientificCalculator extends AdvancedCalculator {
    public int power() {
        this.result = 1;
        for (int i = 0; i < this.num2; i++) {
            this.result *= this.num1;
        }
        return this.result;
    }
}

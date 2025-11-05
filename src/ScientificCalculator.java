public class ScientificCalculator extends AdvancedCalculator {

    public int power() {
        this.result = 1;
        for (int i = 0; i < this.num2; i++) {
            this.result *= this.num1;
        }
        return this.result;
    }

    public String conversionNum() {
        if (this.num2 == 2) {
            this.resultNum = Integer.toBinaryString(this.num1);
        }
        else if (this.num2 == 8) {
            this.resultNum = Integer.toOctalString(this.num1);
        }
        else if (this.num2 == 16){
            this.resultNum = Integer.toHexString(this.num1);
        }
        return this.resultNum;
    }

//        public void binaryConversionNum(int base) {
//            this.base = base;
//            this.resultNum = Integer.toBinaryString(base);
//        }
//
//        public void hexConversionNum(int base) {
//            this.base = base;
//             this.resultNum= Integer.toHexString(base);
//        }
}

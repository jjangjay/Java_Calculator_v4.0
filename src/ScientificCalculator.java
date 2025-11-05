public class ScientificCalculator extends AdvancedCalculator {

    public int power() {
        this.result = 1;
        for (int i = 0; i < this.num2; i++) {
            this.result *= this.num1;
        }
        return this.result;
    }

    private String base_conversion(int num, int base) {
        String strResult;
        boolean isMinus = false;
        if (num == 0) {return "0";}
        if (num < 0) {
            isMinus = true;
            num *= -1;
        }

        String digits = "0123456789abcdef";
        strResult = "";
        while (num != 0) {
            strResult = digits.charAt(num % base) + strResult;
            num /= base;
        }

        if (isMinus) {return "-" + strResult;}
        return strResult;
    }

    public String conversionNum() {
        if (this.num2 == 2) {
            this.resultNum = base_conversion(this.num1, this.num2);
        }
        else if (this.num2 == 8) {
            this.resultNum = base_conversion(this.num1, this.num2);
        }
        else if (this.num2 == 16){
            this.resultNum = base_conversion(this.num1, this.num2);
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

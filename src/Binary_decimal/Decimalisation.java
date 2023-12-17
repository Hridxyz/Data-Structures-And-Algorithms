package Binary_decimal;

public class Decimalisation {

    public static void binaryToDecimal(int binNum) {
        int t = binNum;
        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + t + " is: " + decNum);
    }

    public static void main(String[] args) {
        binaryToDecimal(1011); // Example binary number to convert
    }
}

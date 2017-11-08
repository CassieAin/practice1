package task1;

public class Conversions {
    private int number;

    public Conversions(){}

    public Conversions(int data) {
        this.number = data;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static String convertDecimal(int number, int base){
        //char[] result = new char[100];
        String result = "";

        while (number > 0) {
            if (base == 16) {
                int hexalNumber = number % base;

                char hexDigit = (hexalNumber <= 9 && hexalNumber > 0) ? (char) (hexalNumber + '0')
                        : (char) (hexalNumber - 10 + 'A');
                result = hexDigit + result;
                number = number / base;
            }
            if (base == 8 || base == 2) {
                int remainder = number % base;
                result = remainder + result;

                number = number / base;
            }

        }
        return result;
    }
}

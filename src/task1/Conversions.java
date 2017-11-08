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
                int hexalNumber = number % 16;

                char hexDigit = (hexalNumber <= 9 && hexalNumber > 0) ? (char) (hexalNumber + '0')
                        : (char) (hexalNumber - 10 + 'A');
                result = hexDigit + result;
                number = number / 16;
            }
            if (base == 8) {
                int remainder = number % 8;
                result = remainder + result;

                number = number / 8;
            }
            if (base == 2) {
                int remainder = number % 2;
                result = remainder + result;
                number = number / 2;
            }

        }
        return result;
    }
}

package task1;

public class Check {
    public static void checkConversion(int number, int base){
        if(number <= 0 )
            System.out.println("Illegal number, it can not be converted");
        else {
            if(base == 2 || base == 8 || base == 16){
                System.out.println(Conversions.convertDecimal(number, base));
            }else{
                System.out.println("Illegal base for conversion");
            }
        }
    }
}

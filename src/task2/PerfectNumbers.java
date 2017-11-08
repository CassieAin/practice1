package task2;

public class PerfectNumbers {
    public static void findPerfectNumbers(int[] data){
        System.out.println();
        System.out.print("\n Perfect numbers:\n");
        for(int i = 1; i < data.length; i++){
            if(isPerfectNumber(data[i]))
                System.out.print(data[i] + " ");
        }
    }

    private static boolean isPerfectNumber(int number){
        int temporarySum = 0;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                temporarySum += i;
            }
        }
        if (temporarySum == number) return true;
        return false;
    }
}

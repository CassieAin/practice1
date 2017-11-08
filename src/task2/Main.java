package task2;

public class Main {
    public static void main(String [] args) {
        DisplayNumbers displayNumbers = new DisplayNumbers();
        PerfectNumbers.findPerfectNumbers(displayNumbers.generateRandomArray(1, 100));
    }
}

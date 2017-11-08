package task2;

public class DisplayNumbers {

    private int[] randomNumbers;

    public DisplayNumbers(){}

    public int[] getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(int[] randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public int[] generateRandomArray(int min, int max){
        randomNumbers = new int[max];
        System.out.print(" { ");
        for(int i = min; i < max; i++){
            randomNumbers[i] = (int)(Math.random() * max);
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.print(" } ");
        return randomNumbers;
    }
}

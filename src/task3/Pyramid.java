package task3;

public class Pyramid {

    public static void buildTriangle(int limit){

        if (limit < 1 || limit > 9){
            System.out.println("The input number of rows is invalid");
            return;
        }

        for(int i = 1; i <= limit; i++){
            for(int k = limit - i; k > 0; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = i - 1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}

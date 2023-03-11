import java.sql.SQLOutput;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[10];

        Random rand = new Random();

        for(int i = 0 ; i < num.length ; i++) {
            num[i] = rand.nextInt(101);
        }

        //display array

        System.out.print("Array: [ ");
        for(int i = 0 ; i < num.length ; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.print("]");

        int sum = 0;
        for (int i= 0; i < num.length; i++){
            sum += num[i];
        }
        double average = (double) sum / num.length;
        System.out.println(" ");
        System.out.println("Average: " + average);

        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num [i] > max) {
                max = num[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}

import java.util.Scanner;
import java.util.Arrays;
public class TryCodes {
    void main(){


        // Dobbelt array
        char[][] bio = new char[5][10];
        bio[1][4] = 'x';
        bio[5][10] = 'x';

        // Gem svar i en array

        /*
        String[] array = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv noget bitch");
        array[0] = input.nextLine();
        System.out.println("Skriv noget bitch");
        array[1] = input.nextLine();
        System.out.println("Skriv noget bitch");
        array[2] = input.nextLine();
        System.out.println("Skriv noget bitch");
        array[3] = input.nextLine();
        System.out.println("Skriv noget bitch");
        array[4] = input.nextLine();

        System.out.println(Arrays.toString(array));
         */



        // For loop for summen af en array
        /*
        int sum = 0;
        int[] values = {1,4,6,3,7,3,3};
        for (int i = 0; i < values.length; i = i +1){
            sum = sum + values[i];

        }
        System.out.println(sum);

         */





        /*
        String[] numbers = new String[3];
        numbers[2] =  "Hello";
        System.out.println(numbers[2]);
        */




        // Find højeste tal
        /*
        int[] numbers;
        numbers = new int[]{12,3,46,73,93,100,12,54};
        int highestNumber = numbers[0];

        for (int i = 0; i<numbers.length; i = i + 1) {
            if (numbers[i] > highestNumber) {
                highestNumber = numbers[i];
            }
        }
        System.out.println(highestNumber);
        */

    }
}

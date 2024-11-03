import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Random rnd = new Random();
        double sum = 0; //use a double value for more accurate average computation
        double avg = 0.0;

        Scanner in = new Scanner(System.in);

        for(int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }

        for(int x = 0; x < dataPoints.length; x++) {
            System.out.print(dataPoints[x] + " ");
        }

        System.out.println("\ncontinues offscreen for a while -->");
        System.out.println("\nThe array length is " + dataPoints.length);

        for(int x = 0; x < dataPoints.length; x++) {
            if(x % 20 == 0) {
                System.out.println();
            }
            System.out.printf("%3d |", dataPoints[x]);
        }

        for(int i : dataPoints) {
            sum += i;
        }
        avg = sum / dataPoints.length;
        System.out.println();
        System.out.printf("\nThe sum of the given data points is %.0f", sum);
        System.out.println("\nWhile the computed average is " + avg);

        int inputVal = SafeInput.getRangedInt(in, "Please enter an int from 1 to 100", 1, 100);
        System.out.println("You entered " + inputVal);
        //search for user's inputted value, count how many times it appears in array
        int matchCounter = 0;
        for (int val : dataPoints) {
            if (inputVal == val) {
                    matchCounter ++;
            }
        }
        System.out.println(inputVal + " was found " + matchCounter + " times in the generated data set");

        inputVal = SafeInput.getRangedInt(in, "Please enter another int value from 1 to 100", 1, 100);
        //search loop that returns position of first match in array
        System.out.println("You entered " + inputVal);
        boolean matchFound = false;
        for (int x = 0; x < dataPoints.length; x++) {
            if (inputVal == dataPoints[x]) {
                matchFound = true;
                System.out.println(inputVal + " was first found at position " + x + " in the generated array" );
                break;
            }
        }
        if(!matchFound) {
            System.out.println(inputVal + " was not found in the generated data set");
        }

        //min search
        int min = dataPoints[0];
        for (int value : dataPoints) {
            if (min > value) {
                min = value;
            }
        }
        //max search
        int max = dataPoints[0];
        for (int value : dataPoints) {
            if (max < value) {
                max = value;
            }
        }
        System.out.println();
        System.out.println("The minimum value in the data set is " + min);
        System.out.println("the maximum value in the data set is " + max);

        System.out.println();
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));


        in.close();
    }

    public static double getAverage(int values[]) {
        //using casting this time, so sum can be an int
        int inputSum = 0;
        double inputAvg = 0;
        for (int i : values) {
            inputSum += i;
        }
        inputAvg = (double) inputSum / values.length;
        return inputAvg;
    }
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for(int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }

        for(int x = 0; x < dataPoints.length; x++) {
            System.out.print(dataPoints[x] + " ");
        }

        System.out.println("\ncontinues offscreen for a while -->");
        System.out.println("\nThe array length is " + dataPoints.length);
        System.out.println();

        for(int x = 0; x < dataPoints.length; x++) {
            System.out.print(dataPoints[x] + " | ");
        }
        System.out.println("\nContinues off screen for a while -->");

    }
}
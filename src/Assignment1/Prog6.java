package Assignment1;
import java.util.Arrays;
public class Prog6 {
    public static void main(String[] args) {
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minValue = min(arrayOfInts);
        System.out.println("The minimum value is: " + minValue);

    }

    static int min(int[] arrayOfInts){
        int min = arrayOfInts[0];
        for(int i =1; i<arrayOfInts.length; i++){
            if(arrayOfInts[i]<min){
                min = arrayOfInts[i];
            }
        }
        return min;
    }

}

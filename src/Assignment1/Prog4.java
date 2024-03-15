package Assignment1;

public class Prog4 {
    public static void main(String[] args) {
        float x = 1.27f;
        float y = 3.881f;
        float z = 9.6f;

        int x1 = (int)(x + y + z);
        System.out.println("Integer Sum of " + x + " + " + y + " + " + x + " = " + x1);

        int y1 = Math.round(x+y+z);
        System.out.println("Sum after rounding: " + y1);

    }
}

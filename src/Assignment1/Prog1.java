package Assignment1;

public class Prog1 {
    public static void main(String[] args) {
        int  x = RandomNumbers.getRandomInt(0,9);
        double pi = Math.pow(Math.PI,x);
        System.out.println("x value: " + x);
        System.out.println("pi value: " + pi);

        int y = RandomNumbers.getRandomInt(3,14);
        double z = Math.pow(y,Math.PI);
        System.out.println("y value: " + y);
        System.out.println("y the power of pi value: " + z);
    }
}

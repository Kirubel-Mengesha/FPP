package Assignment4_2;

public class Main {
    //main method
    public static void main(String[] args) {
        Computer c1 = new Computer("Apple", "AppleM1", 16, 32);
        Computer c11 = new Computer("Apple", "AppleM1", 16, 32);
        Computer c2 = new Computer("Lenovo", "Intel core i7", 12, 2.8);

        System.out.println(c1.equals(c11)); //true
        System.out.println(c1.hashCode());  // -2062605643
        System.out.println(c11.hashCode()); // -2062605643

        System.out.println("*".repeat(50));

        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.hashCode());  // -2062605643
        System.out.println(c2.hashCode()); // 1720176935
    }
}

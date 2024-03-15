package Assignment4_2;

public class Driver {
    public static void main(String[] args) {
        Figure[] figures = {
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()

        };

        printFigures(figures);

        System.out.println("-".repeat(16));

        printFiguresWithClassName(figures);

    }
    // Printing figures without class names
    public static void printFigures(Figure[] figures){
        for (Figure f : figures) {
            f.getFigure();
        }
        System.out.println(); // Adding a newline for better formatting
    }


    // Printing figures with class names
    public static void printFiguresWithClassName(Figure[] figures){
        for (Figure f : figures) {
            System.out.print(f.getClass().getSimpleName() + " : ");
            f.getFigure();
            System.out.println();
        }
    }
}

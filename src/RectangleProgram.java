import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width");
        long width = scanner.nextLong();

        System.out.println("Enter height");
        long height = scanner.nextLong();

        float area = width * height;
        System.out.println("Area is " + area);
    }
}
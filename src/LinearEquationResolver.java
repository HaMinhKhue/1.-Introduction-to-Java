import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        System.out.print("a: "); double a=scanner.nextDouble();

        System.out.print("b: "); double b=scanner.nextDouble();

        if(a!=0){
            double solution=-b/a;
            System.out.format("The solution is %10.5f", solution);
        }else if (b!=0){
            System.out.println("No solution");
        }else {
            System.out.println("The solution is all x!");
        }

    }
}

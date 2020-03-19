public class test {
    public static void main(String[] args) {
        int a = 2 < 3 ? 2 : 3;
        switch (a) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("B");
            default:
                System.out.print("C");
                System.out.print("C");
                System.out.println("D");
                System.out.println(a);
                System.out.println("D");
                System.out.print("C");

        }
    }
}

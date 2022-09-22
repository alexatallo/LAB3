import java.util.Scanner ;
class AreaOfrectangle {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("The area of a rectangle = length times width") ;
        System.out.println("Enter length in ft: ") ;
        double length = scanner.nextDouble() ;

        System.out.println("Enter width in ft: ") ;
        double width = scanner.nextDouble();

        double area = length*width ;
        System.out.println("The area of the rectangle is: " + area +"ft");

    }
}
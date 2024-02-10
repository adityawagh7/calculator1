import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                calculateTriangleArea(scanner);
                break;
            case 2:
                calculateRectangleArea(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 for triangle or 2 for rectangle.");
        }
        
        scanner.close();
    }
    
    public static void calculateTriangleArea(Scanner scanner) {
        System.out.println("Enter the base length of the triangle:");
        double base = scanner.nextDouble();
        
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        
        double area = 0.5 * base * height;
        
        System.out.println("The area of the triangle is: " + area);
    }
    
    public static void calculateRectangleArea(Scanner scanner) {
        System.out.println("Enter the value for square:");
        double a = scanner.nextDouble();
        double area = a * a;
        
        System.out.println("The area of the square is: " + area);
    }
}
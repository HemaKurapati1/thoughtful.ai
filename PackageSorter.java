import java.util.Scanner;
public class PackageSorter {

    public static String sort(int width, int height, int length, double mass) {
        
        int volume = width * height * length;
        
        boolean bulky = volume >= 1_000_000 || width >= 150 || height >= 150 || length >= 150;
        boolean heavy = mass >= 20;
        
        if (bulky && heavy) {
            return "REJECTED";
        } else if (bulky || heavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the package (cm): ");
        int width = scanner.nextInt();

        System.out.println("Enter the height of the package (cm): ");
        int height = scanner.nextInt();

        System.out.println("Enter the length of the package (cm): ");
        int length = scanner.nextInt();

        System.out.println("Enter the mass of the package (kg): ");
        double mass = scanner.nextDouble();

        scanner.close();

        String result = sort(width, height, length, mass);

        System.out.println("The package is classified as: " + result);
    }
}
 
       
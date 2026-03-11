import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheitResult;

        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();

        // Formula: (°C × 9/5) + 32 = °F
        fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}
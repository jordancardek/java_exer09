import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        scan.close();
        
        double celsius = 5 * ((fahrenheit-32) / 9);
        
        System.out.println("A temperatura em Celsius é: "+celsius);
    }
}
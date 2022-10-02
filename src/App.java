import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner e = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: ");
        double raio = e.nextDouble();
        e.close();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo e: " + area);

    }
}

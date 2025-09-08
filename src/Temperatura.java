import java.util.Scanner;
public class Temperatura {
    double celsius;
    double kelvin;
    double fahrenheit;

    public void solicitarDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em Celsius:" );
        celsius = scanner.nextDouble();
    }
    public void efetuarCalculo(){
        solicitarDados();
        Scanner scanner = new Scanner(System.in);
        fahrenheit = (celsius * 1.8) + 32;
        kelvin = celsius + 273.15;

    }
    public void exibirResultado(){
        efetuarCalculo();
        System.out.println("---------------------");
        System.out.println("  R E S U L T A D O  ");
        System.out.println(celsius + "°C equivalem a:");
        System.out.println(fahrenheit + "°F (Fahrenheit)");
        System.out.println(kelvin + "°K (Kelvin)");
        System.out.println("----------------------");
    }
}

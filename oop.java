//ex 1

public class App {
    public static void main(String[] args) {
        TempConverter tc = new TempConverter();
        double celsius = 100.0;
        double fahrenheit = 100.0;

        System.out.println(celsius + "°C -> " + tc.convertToFahr(celsius) + "°F");
        System.out.println(fahrenheit + "°F -> " + tc.convertToCelsius(fahrenheit) + "°C");
    }
}

public class TempConverter {
    public double convertToFahr(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}


//ex 2
public class App {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Celsius value: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + "°C -> °F: " + tempConverter.convertToFahr(celsius) + "°F");

        System.out.print("Enter a Fahrenheit value: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + "°F -> °C: " + tempConverter.convertToCelsius(fahrenheit) + "°C");

        scanner.close();
    }
}

public class TempConverter {
    public double convertToFahr(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}


//ex 3
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Choose operation: \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + calculator.divide(num1, num2));
                }
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
    }
}

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }
}


//ex 4
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        NumbersComparator comparator = new NumbersComparator();

        int max = comparator.maximum(num1, num2);
        int min = comparator.minimum(num1, num2);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}

public class NumbersComparator {
    public int maximum(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public int minimum(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }
}

//ex 5
//electrocasnice
public class Electrocasnice {
    // Atribute
    private String nume;
    private double pret;

    // Constructor
    public Electrocasnice(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    // Metode
    public void porneste() {
        System.out.println("Electrocasnica " + nume + " a fost pornita.");
    }

    public void opreste() {
        System.out.println("Electrocasnica " + nume + " a fost oprita.");
    }

    // Getters si Setters
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}

//mobila
public class Mobila {
    // Atribute
    private String tip;
    private String material;

    // Constructor
    public Mobila(String tip, String material) {
        this.tip = tip;
        this.material = material;
    }

    // Metode
    public void crestere() {
        System.out.println("Mobila de tip " + tip + " a fost crescuta.");
    }

    public void scade() {
        System.out.println("Mobila de tip " + tip + " a fost scazuta.");
    }

    // Getters si Setters
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

//profesii
public class Profesii {
    // Atribute
    private String denumire;
    private double salariu;

    // Constructor
    public Profesii(String denumire, double salariu) {
        this.denumire = denumire;
        this.salariu = salariu;
    }

    // Metode
    public void lucreaza() {
        System.out.println("Persoana cu profesia " + denumire + " a inceput sa lucreze.");
    }

    public void inceteazaLucrul() {
        System.out.println("Persoana cu profesia " + denumire + " a incetat sa lucreze.");
    }

    // Getters si Setters
    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }
}

//transport
public class MijloaceDeTransport {
    // Atribute
    private String denumire;
    private int viteza;

    // Constructor
    public MijloaceDeTransport(String denumire, int viteza) {
        this.denumire = denumire;
        this.viteza = viteza;
    }

    // Metode
    public void accelereaza() {
        System.out.println("Mijlocul de transport " + denumire + " a accelerat");
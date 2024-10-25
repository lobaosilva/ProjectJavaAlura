public class Main {

    public static void main (String[] args) {

        double tempC = 30.4;
        double tempF = (tempC * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.1f Celsius é equivalente a %.1f Fahrenheit", tempC, tempF);

        System.out.println(mensagem);

        int tempFInt = (int) tempF;
        System.out.println("A temperatura em Fahrenheit interia é: " + tempFInt);
    }
}
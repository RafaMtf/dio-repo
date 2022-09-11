package one.digitalinovation.basecamp;
import java.util.Scanner;

public class Main {

    public static String operacaoBasica(double x, double y){
        double soma = x + y;
        double subt = x - y;
        double divi = x / y;
        double mult = x * y;

        String output = "Addition: " + soma + "\nSubtraction: " + subt + "\nDivision: " + divi + "\nMultiplication: " + mult;
        return output;
    }

    public static int horaDoDia(int hora){
        return hora;
    }

    public static String mensagem(int hora){
        if (horaDoDia(hora)<11){
            System.out.println("Bom dia!");
        }
        else if (horaDoDia(hora)>=12 && horaDoDia(hora)<=17){
            System.out.println("Boa tarde!");
        }
        else{
            System.out.println("Boa noite!");
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner inputNumeros = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        int num1 = inputNumeros.nextInt();
        int num2 = inputNumeros.nextInt();

        Scanner inputHora = new Scanner(System.in);
        System.out.println("Enter the time of the day:");

        int hora = inputHora.nextInt();

        Scanner inputEmprestimo = new Scanner(System.in);
        System.out.println("What's the amount of the loan:");

        double valor = inputEmprestimo.nextInt();

        Scanner inputParcelas = new Scanner(System.in);
        System.out.println("Choose: 2 installments or 3 installments");

        double parcelas = inputParcelas.nextInt();

        System.out.println("\n" + operacaoBasica(num1, num2));
        System.out.println(mensagem(hora));
        Emprestimo.calcular(valor,parcelas);
    }
}
package one.digitalinovation.basecamp;

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.2;
    }

    public static double getTaxaTresParcelas(){
        return 0.35;
    }

    public static void calcular(double valor, double parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("The final value of the loan for 2 installments is R$" + valorFinal);
        }
        else if (parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("The final value of the loan for 3 installments is R$" + valorFinal);
        }
        else {
            System.out.println("Not a valid number of installments.");
        }

    }

}

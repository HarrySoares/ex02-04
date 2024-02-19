package calculadora;

public class Calculadora {

   public static void main(String[] args) {
        CalculadoraBinaria calculadoraBinariaExistente = new CalculadoraBinariaExistente();

        CalculadoraDecimal calculadoraDecimal = new CalculadoraBinariaAdapter(calculadoraBinariaExistente);

        System.out.println("Soma: " + calculadoraDecimal.somar(5, 3));
        System.out.println("Subtração: " + calculadoraDecimal.subtrair(8, 2));
        System.out.println("Multiplicação: " + calculadoraDecimal.multiplicar(4, 6));
    }
}
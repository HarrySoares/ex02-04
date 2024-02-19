package calculadora;

class CalculadoraBinariaAdapter implements CalculadoraDecimal {
    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraBinariaAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
 
        String resultadoBinario = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String resultadoBinario = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
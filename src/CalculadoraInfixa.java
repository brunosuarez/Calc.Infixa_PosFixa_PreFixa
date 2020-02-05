public class CalculadoraInfixa extends CalculadoraBase {

    protected double resultado;
    protected double resultadoSoma;
    protected double resultadoSubtrair;
    protected double resultadoDividir;
    protected double resultadoMultiplicar;
    protected double resultadoPotencializar;

    @Override
    protected void executar(String[] vetorInfixa){
        for (int i = 0; i < vetorInfixa.length; i++) {
            switch (vetorInfixa[i]) {
                case "+":
                    somar(Double.parseDouble(vetorInfixa[i - 1]), Double.parseDouble(vetorInfixa[i + 1]));
                    break;
                case "-":
                    subtrair(Double.parseDouble(vetorInfixa[i - 1]), Double.parseDouble(vetorInfixa[i + 1]));
                    break;
                case "/":
                    dividir(Double.parseDouble(vetorInfixa[i - 1]), Double.parseDouble(vetorInfixa[i + 1]));
                    break;
                case "*":
                    multiplicar(Double.parseDouble(vetorInfixa[i - 1]), Double.parseDouble(vetorInfixa[i + 1]));
                    break;
                case "^":
                    potencializar(Double.parseDouble(vetorInfixa[i - 1]), Double.parseDouble(vetorInfixa[i + 1]));
                    break;
                default:
                    System.out.println("Escolha apenas as operações + , - , / , * , ^ ");
                    break;
            }
        }
    }
}

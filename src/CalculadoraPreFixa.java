public class CalculadoraPreFixa extends CalculadoraBase {

    protected void executar(String[] vetorPreFixa){
        for (int i = 0; i < vetorPreFixa.length; i++) {
            switch (vetorPreFixa[i]) {
                case "+":
                    somar(Double.parseDouble(vetorPreFixa[i - 1]), Double.parseDouble(vetorPreFixa[i + 2]));
                    break;
                case "-":
                    subtrair(Double.parseDouble(vetorPreFixa[i - 1]), Double.parseDouble(vetorPreFixa[i + 2]));
                    break;
                case "/":
                    dividir(Double.parseDouble(vetorPreFixa[i - 1]), Double.parseDouble(vetorPreFixa[i + 2]));
                    break;
                case "*":
                    multiplicar(Double.parseDouble(vetorPreFixa[i - 1]), Double.parseDouble(vetorPreFixa[i + 2]));
                    break;
                case "^":
                    potencializar(Double.parseDouble(vetorPreFixa[i - 1]), Double.parseDouble(vetorPreFixa[i + 2]));
                    break;
                default:
                    System.out.println("Escolha apenas as operações + , - , / , * , ^ ");
                    break;
            }
        }
    }
}

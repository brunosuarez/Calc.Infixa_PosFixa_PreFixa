import java.util.Stack;

public class CalculadoraPosFixa extends  CalculadoraBase{

    public Double realizarOpercoes(String[] elementos) {
        Stack<Double> pilha = new Stack<Double>();
        String operators = "+-*/^";
        for (String elemento : elementos) {
            if (!operators.contains(elemento)) {
                pilha.push(Double.valueOf(elemento));
                continue;
            }
            double primeiroElemento = pilha.pop();
            double segundoElemento = pilha.pop();
            if (elemento.equals("+")) {
                somar(segundoElemento, primeiroElemento);
                pilha.push(getResultado());
            } else if (elemento.equals("-")) {
                subtrair(segundoElemento, primeiroElemento);
                pilha.push(getResultado());
            } else if (elemento.equals("*")) {
                multiplicar(segundoElemento, primeiroElemento);
                pilha.push(getResultado());
            } else if (elemento.equals("/")){
                dividir(segundoElemento, primeiroElemento);
                pilha.push(getResultado());
            }

        }
        return pilha.pop();
    }

    @Override
    protected void executar(String[] vetorPosFixa){
        realizarOpercoes(vetorPosFixa);
        System.out.println(realizarOpercoes(vetorPosFixa));
    }
}

import java.util.Stack;

public class CalculadoraInfixaParenteses extends CalculadoraInfixa {

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
            } else if (elemento.equals("^")){
                potencializar(segundoElemento, primeiroElemento);
                pilha.push(getResultado());
            } else if (elemento.equals("/")){
                dividir(segundoElemento, primeiroElemento);
                pilha.push(getResultado());
            }
        }
        return pilha.pop();
    }

    public static String[] expParaNotacao(String input){
        if (input == null)
            return null;
        char[] in = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < in.length; i++)
            switch (in[i]) {
                case '+':
                case '-':
                    while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
                        saida.append(' ');
                        saida.append(stack.pop());
                    }
                    saida.append(' ');
                    stack.push(in[i]);
                    break;
                case '*':
                case '/':
                case '^':
                    saida.append(' ');
                    stack.push(in[i]);
                    break;
                case '(':
                    stack.push(in[i]);
                    break;
                case ')':
                    while (!stack.empty() && stack.peek() != '(') {
                        saida.append(' ');
                        saida.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    saida.append(in[i]);
                    break;
            }

        while (!stack.isEmpty())
            saida.append(' ').append(stack.pop());
        return saida.toString().split(" ");
    }



    @Override
    protected void executar(String[] vetorInfixa) {
       Double vetor = realizarOpercoes(vetorInfixa);
    }

}

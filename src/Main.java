import com.sun.javaws.exceptions.CacheAccessException;
import java.util.Scanner;
public class Main {

    private static String[] convertExp(String exp) {
        return exp.split(" ");
    }

    public static void main(String[] args) {

        Scanner opcaoCalc = new Scanner(System.in);
        Scanner expressao = new Scanner(System.in);

        System.out.println("Por favor, escolha uma calculadora para fazer o cálculo de sua expressão: \n" +
                "1 - Calculadora Infixa\n" +
                "2 - Calculadora Infixa c Parenteses\n" +
                "3 - Calculadora PosFixa\n" +
                "4 - Calculadora Prefixa\n"
        );
        String operacao = opcaoCalc.next();

        System.out.println("Agora que escolheu uma Calculadora, digite uma expressao condizente com a opção escolhida: \n" +
                "Infixa: " + "5 + 10 - 2 * 5 + 2 / 8 ^ 3 + 1\n" +
                "Infixa com Parenteses: " + "((5 + 10) - (2 * 5) + (2 / (8 ^ 3)) + 1)\n" +
                "PosFixa: 2 5 9 + * 2 4 - * 6 *\n" +
                "Prefixa: + + 5 * 5 3 1 5 + 5 * 3 + 1 \n"
        );
        String exp = expressao.next();

        if(opcaoCalc.equals(1)) {
            CalculadoraInfixa calculadoraInfixa = new CalculadoraInfixa();
            String[] vetorInfixa = convertExp(calculadoraInfixa.getExp());
            calculadoraInfixa.executar(vetorInfixa);
            System.out.println(vetorInfixa);
        }

        else if(opcaoCalc.equals(2)) {
            CalculadoraInfixaParenteses calculadoraInfixaParenteses = new CalculadoraInfixaParenteses();
            String[] vetorInfixaParenteses = CalculadoraInfixaParenteses.expParaNotacao(exp);
            calculadoraInfixaParenteses.executar(vetorInfixaParenteses);
            System.out.println(vetorInfixaParenteses);
        }

        else if(opcaoCalc.equals(3)) {
            CalculadoraPosFixa calculadoraPosFixa = new CalculadoraPosFixa();
            String[] vetorPosFixa = convertExp("");
            calculadoraPosFixa.executar(vetorPosFixa);
            System.out.println(vetorPosFixa);
        }

        else if (opcaoCalc.equals(4)) {
            CalculadoraPreFixa calculadoraPreFixa = new CalculadoraPreFixa();
            String[] vetorPreFixa = convertExp("");
            calculadoraPreFixa.executar(vetorPreFixa);
            System.out.println(vetorPreFixa);
        }
    }
}


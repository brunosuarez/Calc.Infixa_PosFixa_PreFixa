public class CalculadoraBase {

    protected double resultado;
    protected String exp;

    public CalculadoraBase() {
    }

    protected double getResultado() {
        return this.resultado;
    }

    protected void setResultado(double resultado) {
        this.resultado = resultado;
    }

    protected String getExp() {
        return this.exp;
    }

    protected void setExp(String exp) {
        this.exp = exp;
    }

    protected void somar(double x, double y) {
        resultado = + x + y;
    }

    protected void subtrair(double x, double y) {
        resultado = x - y;
    }

    protected void dividir(double x, double y) {
        resultado = + x / y;
    }

    protected void multiplicar(double x, double y) {
        resultado = x * y;
    }

    protected void potencializar(double x, double y) {
        resultado = + Math.pow(x, y);
    }

    protected void executar(String[] vetor){

    }
}

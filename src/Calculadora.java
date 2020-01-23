public abstract class Calculadora {

    protected double resultado;
    protected String exp = "5 + 10 - 2 * 5 + 2 / 8 ^ 3 + 1";

    protected double getResultado() {
        return resultado;
    }

   protected void setResultado(double resultado) {
        this.resultado = resultado;
    }

    protected String getExp(){
        return exp;
    }

    protected void setExp(String exp){
        this.exp = exp;
    }

    protected void somar(double x, double y){
        resultado = x + y;//
    }

    protected void subtrair(double x, double y){
        resultado = x - y;
    }

    protected void dividir(double x, double y){
        resultado = x / y;
    }

    protected void multiplicar(double x, double y){
        resultado = x * y;
    }

    protected void potencializar(double x, double y){
        resultado = Math.pow(x,y);
    }

    protected void executar(){

    }

}



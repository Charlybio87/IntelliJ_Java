public class Operacion{
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Operaciones{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
    public int sumar(int num1, num2){
        return (num1+num2);
    }
    public void int sumar2(int num1, int num2){
        int resultado = (num1+num2);
        System.out.println("Resultado de la suma: " + resultado);
    }
}

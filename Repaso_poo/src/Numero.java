public class Numero {
    int num1;

    public Numero(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "num1=" + num1 +
                '}';
    }
}

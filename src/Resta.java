public class Resta implements Operacion{

    @Override
    public int operacion(int num1, int num2) {
        return num1 - num2; //Rama Resta Henry.
    }

    public int operacion(int num1, int num2, int num3) {
        return num1 - num2 -num3;
    }
}

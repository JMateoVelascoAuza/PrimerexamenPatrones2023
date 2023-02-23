package examen1.ej5;

public class Multiplication extends Operations{

    public Multiplication(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("*")){
            context.isMul = true;
            context.input = context.input.substring(this.digit);
        }

    }
}

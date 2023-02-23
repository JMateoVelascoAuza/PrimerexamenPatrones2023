package examen1.ej5;

public class Addition extends Operations{

    public Addition(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("+")){
            context.isMul = false;
            context.input = context.input.substring(this.digit);
        }

    }
}

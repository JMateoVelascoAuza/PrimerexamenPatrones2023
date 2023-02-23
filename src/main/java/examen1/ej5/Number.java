package examen1.ej5;

public class Number extends Operations{
    public Number(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        context.mulFactor = this.digit;
        if(context.isMul){
            context.output = context.output*(Integer.parseInt(context.input.substring(0, this.digit)));

        } else {
            context.output = context.output+(Integer.parseInt(context.input.substring(0, this.digit)));
        }

        context.input = context.input.substring(this.digit);
    }
}

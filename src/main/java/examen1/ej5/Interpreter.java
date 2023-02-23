package examen1.ej5;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Operations{
    private List<Operations> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msg){
        context = new Context(msg.replace(" ", ""));
        for(String c : msg.split(" ")){
            switch (c){
                case "+":
                    grammar.add(new Addition(c.length()));
                    break;
                case "*":
                    grammar.add(new Multiplication(c.length()));
                    break;
                default:
                    grammar.add(new Number(c.length()));
                    break;
            }
        }
    }

    public int evalMsg(){
        for(Operations op: grammar){
            op.interpreter(context);
        }
        return context.output;
    }


    @Override
    public void interpreter(Context context) {

    }
}

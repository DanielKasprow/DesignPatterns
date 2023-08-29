package BehavioralDesignPatterns.Interpreter.challenge;


interface Expression {
    boolean interpret(Context context);
}

class Terminal implements Expression{

    private String data;

    public Terminal(final String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(final Context context) {
        return context.getResult(data);
    }
}

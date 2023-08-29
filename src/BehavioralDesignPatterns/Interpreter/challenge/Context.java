package BehavioralDesignPatterns.Interpreter.challenge;

class Context {

    private String input;

    public Context(final String input) {
        this.input = input;
    }

    public boolean getResult(String data){
        return input.contains(data);
    }
}

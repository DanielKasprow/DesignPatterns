package BehavioralDesignPatterns.Interpreter.challenge;

class Main {
    public static Expression getMaleExpression() {
        Expression robert = new Terminal("Robert");
        Expression john = new Terminal("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new Terminal("Julie");
        Expression married = new Terminal("Married");
        return new AndExpression(julie, married);
    }

    public static void main (String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context ic = new Context("John");
        System.out.println("John is male? " + isMale.interpret(ic));

        Context ic2 = new Context("Married Julie");
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret(ic2));

        Context ic3 = new Context("Lucy");
        System.out.println("Lucy is male? " + isMale.interpret(ic3));
    }
}

package BehavioralDesignPatterns.Visitor.challenge;

class Main {
    public static void main(String[] args) {
        Visitor visitorUS = new USPostageVisitor();
        Visitor visitorSA = new SouthAmericaPostageVisitor();

        visitorUS.visit(new Book(8.52f, 1.05f));
        visitorUS.visit(new CD(18.52f, 3.05f));
        visitorUS.visit(new DVD(6.53f, 4.02f));

        visitorSA.visit(new Book(8.52f, 1.05f));
        visitorSA.visit(new CD(18.52f, 3.05f));
        visitorSA.visit(new DVD(6.53f, 4.02f));

        System.out.println(visitorUS.getTotalPostage());
        System.out.println(visitorSA.getTotalPostage());

    }
}

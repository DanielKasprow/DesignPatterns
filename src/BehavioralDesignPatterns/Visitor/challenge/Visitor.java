package BehavioralDesignPatterns.Visitor.challenge;

interface Visitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
    double getTotalPostage();
}
class USPostageVisitor implements Visitor{
    private float totalPostageForCart = 0.0f;
    @Override
    public void visit(final Book book) {
        final float cost = 2.0f;
        if(book.getPrice() < 20.0f){
            totalPostageForCart += book.getWeight() * cost;
        }
        else{
            totalPostageForCart += book.getWeight() * cost + 5.0f;
        }
    }

    @Override
    public void visit(final CD cd) {
        final float cost = 2.5f;
        if(cd.getPrice() < 20.0f){
            totalPostageForCart += cd.getWeight() * cost;
        }
        else{
            totalPostageForCart += cd.getWeight() * cost + 5.0f;
        }
    }

    @Override
    public void visit(final DVD dvd) {
        final float cost = 3.0f;
        if(dvd.getPrice() < 20.0f){
            totalPostageForCart += dvd.getWeight() * cost;
        }
        else{
            totalPostageForCart += dvd.getWeight() * cost + 5.0f;
        }
    }

    @Override
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
class SouthAmericaPostageVisitor implements Visitor{
    private float totalPostageForCart = 0.0f;
    @Override
    public void visit(final Book book) {
        final float cost = 2.0f;
        if(book.getPrice() < 30.0f){
            totalPostageForCart += book.getWeight() * cost;
        }
        else{
            totalPostageForCart += book.getWeight() * cost + 5.0f;
        }
    }

    @Override
    public void visit(final CD cd) {
        final float cost = 2.5f;
        if(cd.getPrice() < 30.0f){
            totalPostageForCart += cd.getWeight() * cost;
        }
        else{
            totalPostageForCart += cd.getWeight() * cost + 5.0f;
        }
    }

    @Override
    public void visit(final DVD dvd) {
        final float cost = 3.0f;
        if(dvd.getPrice() < 30.0f){
            totalPostageForCart += dvd.getWeight() * cost;
        }
        else{
            totalPostageForCart += dvd.getWeight() * cost + 5.0f;
        }
    }

    @Override
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
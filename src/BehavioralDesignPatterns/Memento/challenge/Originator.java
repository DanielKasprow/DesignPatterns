package BehavioralDesignPatterns.Memento.challenge;

class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
    // creates the memento
    public Memento saveStateToMemento() {
        return new Memento(this.state);
    }

    // restore into its earlier state
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

}

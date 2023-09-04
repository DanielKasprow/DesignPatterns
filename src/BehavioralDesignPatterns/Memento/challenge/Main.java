package BehavioralDesignPatterns.Memento.challenge;

class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("first\n");
        originator.setState("second\n");
        caretaker.add(originator.saveStateToMemento());
        System.out.println(originator.getState());
        originator.setState("third\n");
        caretaker.add(originator.saveStateToMemento());

        System.out.println(originator.getState());
        originator.getStateFromMemento(caretaker.get(1));

        System.out.println(originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println(originator.getState());


    }
}

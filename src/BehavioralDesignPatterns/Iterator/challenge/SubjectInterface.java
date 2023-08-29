package BehavioralDesignPatterns.Iterator.challenge;

import java.util.LinkedList;

interface SubjectInterface {
    IteratorInterface createIterator();
}
class Arts implements SubjectInterface{
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English" ;
    }

    @Override
    public IteratorInterface createIterator() {
        return new ArtsIterator(subjects);
    }
}
class Science implements SubjectInterface{
    private LinkedList<String> subjects;

    public Science()  {
        subjects = new LinkedList<>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}
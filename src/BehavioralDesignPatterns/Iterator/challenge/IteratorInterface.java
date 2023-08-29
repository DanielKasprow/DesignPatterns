package BehavioralDesignPatterns.Iterator.challenge;

import java.util.LinkedList;

interface IteratorInterface {
    void first();
    String next();
    boolean isDone();
    String currentItem();
}
class ArtsIterator implements IteratorInterface{

    private int position;
    private String[] subjects;

    public ArtsIterator(String[] subjects) {
        this.position = 0;
        this.subjects = subjects;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {

        return subjects[position++];
    }

    @Override
    public boolean isDone() {
        return position>=subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}

class ScienceIterator implements IteratorInterface{
    private int position;
    private LinkedList<String> subjects;

    public ScienceIterator(LinkedList<String> subjects) {
        this.position = 0;
        this.subjects = subjects;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {

        return subjects.get(position++);
    }

    @Override
    public boolean isDone() {
        return position>=subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }
}
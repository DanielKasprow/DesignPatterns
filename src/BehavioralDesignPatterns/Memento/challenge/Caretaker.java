package BehavioralDesignPatterns.Memento.challenge;



import java.util.ArrayList;
import java.util.List;

class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        this.mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}

package BehavioralDesignPatterns.Iterator.challenge;

class Main {

    public static void print(IteratorInterface iteratorInterface){
        while (!iteratorInterface.isDone()){
            System.out.println(iteratorInterface.next());
        }
    }
    public static void main(String[] args) {
        SubjectInterface arts =  new Arts();
        SubjectInterface science = new Science();

        IteratorInterface iteratorInterface = arts.createIterator();
        IteratorInterface iteratorInterface2 = science.createIterator();


        print(iteratorInterface);
        print(iteratorInterface2);

    }
}

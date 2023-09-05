package BehavioralDesignPatterns.Observer.challenge;

interface Observer {
    public void update(int runs, int wickets,float overs);
}
class AverageScore implements Observer{

    private float runRate;
    private int predictedScore;
    @Override
    public void update(int runs, int wickets,float overs) {
        this.runRate = (float)runs/overs;
        predictedScore = (int)this.runRate *50;
        display();
    }
    public void display()   {
        System.out.println("\nAverage Score Display: \n"
                + "Run Rate: " + runRate +
                "\nPredictedScore: " +
                predictedScore);
    }
}
class CurrentScore implements Observer{

    private int runs, wickets;
    private float overs;
    @Override
    public void update(int runs, int wickets,float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display()   {
        System.out.println("\nCurrent Score Display:\n"
                + "Runs: " + runs +
                "\nWickets:" + wickets +
                "\nOvers: " + overs );
    }
}
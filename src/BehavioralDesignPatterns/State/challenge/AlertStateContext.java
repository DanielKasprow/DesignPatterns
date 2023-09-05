package BehavioralDesignPatterns.State.challenge;


public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext()   {
        currentState = new Vibration();  // default state
    }

    public void setState(MobileAlertState state)  {
        currentState = state;
    }

    public void alert() {
        currentState.alert();
    }
}




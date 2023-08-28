package BehavioralDesignPatterns.ChainOfResponsibility.challenge;

class IssueRaiser {
    ReceiverInterface receiverInterface;

    public IssueRaiser(final ReceiverInterface receiverInterface) {
        this.receiverInterface = receiverInterface;
    }
    public void raiseMessage(Message message){
        if(receiverInterface != null){
            receiverInterface.processMessage(message);
        }
    }
}

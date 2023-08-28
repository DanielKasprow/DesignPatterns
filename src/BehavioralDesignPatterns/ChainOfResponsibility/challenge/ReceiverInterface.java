package BehavioralDesignPatterns.ChainOfResponsibility.challenge;


interface ReceiverInterface {

    boolean processMessage(Message message);
    void setNextChain(ReceiverInterface receiverInterface);

}
class FaxErrorHandler implements ReceiverInterface{

    ReceiverInterface receiverInterface;
    @Override
    public boolean processMessage(final Message message) {
        if(message.text.contains("Fax")){
            System.out.println("FaxErrorHandler processed "+  message.messagePriority+ " priority issue: "+ message.text);
            return true;
        }
        else  {
            if (receiverInterface != null)
                receiverInterface.processMessage(message);
        }
        return false;
    }

    @Override
    public void setNextChain(final ReceiverInterface receiverInterface) {
        this.receiverInterface = receiverInterface;
    }
}

class EmailErrorHandler implements ReceiverInterface{

    ReceiverInterface receiverInterface;

    @Override
    public boolean processMessage(final Message message) {
        if(message.text.contains("Email")){
            System.out.println("EmailErrorHandler processed "+ message.messagePriority + " priority issue: "+ message.text);
            return true;
        }
        else  {
            if (receiverInterface != null)
                receiverInterface.processMessage(message);
        }
        return false;
    }

    @Override
    public void setNextChain(final ReceiverInterface receiverInterface) {
        this.receiverInterface = receiverInterface;
    }
}
package BehavioralDesignPatterns.ChainOfResponsibility.challenge;

enum MessagePriority{Normal, High};
class Message {
    String text;
    MessagePriority messagePriority;
    public Message(final String text, MessagePriority messagePriority) {
        this.text = text;
        this.messagePriority = messagePriority;
    }

}

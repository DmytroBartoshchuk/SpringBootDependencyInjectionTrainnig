package pl.akademiakodu.beans;

/**
 * Created by DmytroBartoshchuk on 28.03.2017.
 */
public class MessagePrinter {

    private String name;
    private MessageProducer messageProducer;

    public MessagePrinter(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessageProducer getMessageProducer() {
        return messageProducer;
    }

    public void setMessageProducer(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void print(){
        System.out.println(messageProducer.getMessage());
    }
}

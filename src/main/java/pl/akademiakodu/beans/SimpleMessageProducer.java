package pl.akademiakodu.beans;

/**
 * Created by DmytroBartoshchuk on 28.03.2017.
 */
public class SimpleMessageProducer implements MessageProducer{
    @Override
    public String getMessage() {
        return "Message"+System.currentTimeMillis();
    }
}

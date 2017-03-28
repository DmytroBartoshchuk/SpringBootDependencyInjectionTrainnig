package pl.akademiakodu.beans1;

import org.springframework.stereotype.Component;

/**
 * Created by DmytroBartoshchuk on 28.03.2017.
 */
@Component
public class SimpleMessage implements Message {
    @Override
    public void printEmployee(Employee employee) {
        System.out.println(employee.getName()+" "+employee.getSurname());
    }
}

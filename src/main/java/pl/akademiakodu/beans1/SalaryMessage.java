package pl.akademiakodu.beans1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by DmytroBartoshchuk on 28.03.2017.
 */
@Primary
@Component
public class SalaryMessage implements Message{

    @Override
    public void printEmployee(Employee employee) {
        System.out.println(employee.getSurname() + "'s salary is " + employee.getSalary());
    }
}

package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import pl.akademiakodu.beans.MessagePrinter;
import pl.akademiakodu.beans1.Employee;

@SpringBootApplication
@ImportResource("classpath:beans-config.xml")
@ComponentScan
@EnableAutoConfiguration
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		// beans1
		Employee employee = ctx.getBean(Employee.class);
		employee.setName("Dmytro");
		employee.setSurname("Bartoshchuk");
		employee.setSalary(10000.00);
		employee.getMessage().printEmployee(employee);



		// beans
		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
		System.out.println(printer.getName());
		printer.print();
		ctx.close();
	}
}

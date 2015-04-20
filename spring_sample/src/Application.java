import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lennox.spring.service.CustomerService;
import com.lennox.spring.service.CustomerServiceImpl;


public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = 
				context.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}
}

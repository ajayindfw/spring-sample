import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lennox.spring.service.CustomerService;
import com.lennox.spring.service.CustomerServiceImpl;


public class Application {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = 
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = 
				appContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());
		
		System.out.println("Customer service:" + customerService);
		
		CustomerService customerService2 = 
				appContext.getBean("customerService", CustomerService.class);
		
		System.out.println("Customer service 2:" + customerService2);

		if (customerService == customerService2) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
	}
}

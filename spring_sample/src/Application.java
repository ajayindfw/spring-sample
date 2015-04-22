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
	}
}

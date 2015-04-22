import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lennox.spring.repository.CustomerRepository;
import com.lennox.spring.repository.HibernateCustomerRepositoryImpl;
import com.lennox.spring.service.CustomerService;
import com.lennox.spring.service.CustomerServiceImpl;


@Configuration
@ComponentScan({"com.lennox.spring"})
public class AppConfig {
	
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}
	
	
}

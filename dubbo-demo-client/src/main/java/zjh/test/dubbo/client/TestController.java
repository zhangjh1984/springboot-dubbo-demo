package zjh.test.dubbo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {
	
	@Autowired
	private ClientService clientService;

	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public String sayHello() {
//		SpringBeanUtil.getBean(ClientService.class)
		return clientService.sayHello();
	}
}

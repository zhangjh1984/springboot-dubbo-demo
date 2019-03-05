package zjh.test.dubbo.client;


import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import zjh.test.dubbo.api.IHelloService;

@Component
public class ClientService {

	@Reference(check=false)
	public IHelloService helloService;
	
	public String sayHello() {
		return helloService.sayHello();
	}
}

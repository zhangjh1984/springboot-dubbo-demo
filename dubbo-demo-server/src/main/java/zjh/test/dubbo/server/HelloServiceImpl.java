package zjh.test.dubbo.server;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import zjh.test.dubbo.api.IHelloService;

@Component
@Service(interfaceClass=IHelloService.class)
public class HelloServiceImpl implements IHelloService{

	public String sayHello() {
		return "hello world";
	}

}

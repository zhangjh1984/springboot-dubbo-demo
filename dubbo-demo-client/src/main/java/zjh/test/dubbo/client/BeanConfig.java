package zjh.test.dubbo.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.annotation.Reference;

import zjh.test.dubbo.api.IHelloService;

@Configuration
public class BeanConfig {

//	@Reference(check = false,version = "1.0.0")
//	public IHelloService helloService;
//	
//	@Bean
//	public IHelloService helloService() {
//		return helloService;
//	}
}

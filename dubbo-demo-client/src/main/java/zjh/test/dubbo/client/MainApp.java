package zjh.test.dubbo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


//@EnableDubboConfig
//@DubboComponentScan(basePackages = "zjh.test.dubbo.client")
@ImportResource("classpath:client.xml")
@ComponentScan(value = { "zjh.test.dubbo.client" })
@SpringBootApplication
public class MainApp {	
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
		
	}
}

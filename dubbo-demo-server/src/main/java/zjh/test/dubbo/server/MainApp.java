package zjh.test.dubbo.server;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;

@SpringBootApplication
@EnableDubboConfig
@ComponentScan(value = { "zjh.test.dubbo.server" })
@ImportResource("classpath:provider.xml")
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
		System.out.println("server start");
//		 try {
//			System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}

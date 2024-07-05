package study.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientToAccessBasicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientToAccessBasicAppApplication.class, args);
	}

}

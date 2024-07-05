package study.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "BasicApplicationToTestFeinClient", url = "http://localhost:1000/basic/api")
public interface FeignClientUtility {

	@GetMapping("/name")
	String getName();
	
	@GetMapping("/age")
	String getAge();
	
	@GetMapping("/dist")
	String getDistrict();
	
	
}

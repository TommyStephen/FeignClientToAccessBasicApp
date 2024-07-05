package study.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign-client")
public class FeignClientController {

	@Autowired
	private FeignClientUtility feignClient;
	
	@GetMapping("/n")
	public String getName() {
		return feignClient.getName();
	}
	
	@GetMapping("/a")
	public String getAge() {
		return feignClient.getAge();
	}
	
	@GetMapping("/d")
	public String getDString() {
		return feignClient.getDistrict();
	}
	
	
}



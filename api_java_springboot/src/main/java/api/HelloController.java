package api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value="users",method=RequestMethod.GET)
	public Object users() {
		List<String>userList=new ArrayList<>();
		userList.add("tom");
		userList.add("and");
		userList.add("jerry");
		return userList;
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public Object login(String name,String pwd) {
		Map<String,Object>map=new HashMap<>();
		if("123".equals(pwd)&&"jack".equals(name)) {
			map.put("status",0);
		}else {
			map.put("status", -1);
		}
		return map;
	}
}
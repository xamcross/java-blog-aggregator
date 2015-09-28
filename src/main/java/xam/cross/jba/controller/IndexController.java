package xam.cross.jba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/huindex")
	public String index(){
		return "index";
	}
	
}

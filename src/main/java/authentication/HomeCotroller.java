package authentication;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import authentication.User;
import authentication.UserRepository;

@Controller
public class HomeCotroller {
	
	/*@Autowired
	private UserRepository userRepository;*/
	
	 @RequestMapping("/")
	    public String index(){
	        return "index";
	    }

	    @RequestMapping("/login")
	    public String login(){
	        return "login";
	    }
	    

}

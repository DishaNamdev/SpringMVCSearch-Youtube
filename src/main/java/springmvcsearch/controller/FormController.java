package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.entity.StudentEntity;

@Controller
public class FormController {
	
	@RequestMapping("/complex")
	public String showForm() {
		return "complex_form";
	}
	
/*************** Old method of binding the user entered values with the data fields ***********************/
//	@RequestMapping(path="/handleform",method=RequestMethod.POST)
//	public String formHandler(@RequestParam("name") String name,@RequestParam("id") Long id) {
//		System.out.println(name);
//		System.out.println(id);
//		return "success";
//	}
	
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("studententity")StudentEntity student){
		System.out.println(student);
		return "success";
	}
}

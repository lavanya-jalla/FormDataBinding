package com.example.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mvc.model.Student;

@Controller
public class StudentController {
	 @Value("${countries}")
	    private List<String> countries;
	 @Value("${languages}")
	    private List<String> languages;
	 @GetMapping("/showStudentForm")
	    public String showForm(Model model) {
		 model.addAttribute("student",new Student());
		 model.addAttribute("countries",countries);
		 model.addAttribute("languages",languages);

		 model.addAttribute("osOptions", List.of("Windows", "Linux", "Mac"));
	        return "student-form";  
	    }

	    @PostMapping("/processStudentForm")
	    public String processForm(@ModelAttribute("student") Student student) {
	    	System.out.println("Student: " + student.getFirstName() +" "+ student.getLastName() +" "+student.getCountry()+" "+student.getFavLang()+" "+ student.getFavOS());
	        return "student-confirmation"; 
	    }

}

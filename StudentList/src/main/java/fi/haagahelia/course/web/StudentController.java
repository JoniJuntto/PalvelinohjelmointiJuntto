package fi.haagahelia.course.web;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import fi.haagahelia.course.domain.*;
import fi.haagahelia.course.domain.Message;


import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

	@RequestMapping("/hello")
		public String showStudentList(Model model) {
		List<Student> students = new ArrayList<Student>();
		
		Student student1 = new Student("Joni", "Juntto");
		Student student2 = new Student("Mari", "Pelkonen");
		Student student3 = new Student("Janne", "Hyypiä");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		model.addAttribute("students", students);
		
			return "hello";
		}
}
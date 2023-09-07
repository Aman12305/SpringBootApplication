package com.springbootmvc.frontend.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.springbootmvc.frontend.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	RestTemplate rt;
	final String url="http://localhost:8080/api/v1/employees";
	
	@RequestMapping("/greet")
	public ModelAndView processGreet()
	{
		String str="Hello World!!!";
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", str);
		mv.setViewName("view1");
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView processHome()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("employeeHome");
		return mv;
	}
	
	@GetMapping("/showEmployee")
	public ModelAndView processFetchEmployee(@RequestParam int employeeId)
	{
//		System.out.println("employeeId: " + employeeId);
		Employee obj=rt.getForObject(url + "/" + employeeId, Employee.class);
		
		List<Employee> employList  = new ArrayList<Employee>();
		employList.add(obj);
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("employeeList", employList);
		mv.setViewName("employeeList");
		return mv;
	}
	@GetMapping("/showAll")
	public ModelAndView processFetchAll()
	{
		List<Employee> obj=Arrays.asList(rt.getForObject(url, Employee[].class));
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("employeeList", obj);
		mv.setViewName("employeeList");
		return mv;
	}
	
	@PostMapping("/insertEmployee")
	public ModelAndView processInsertTrainee(@ModelAttribute Employee t)
	{
		System.out.println("Insert a Employee");
		Employee obj=rt.postForObject(url,t, Employee.class);
		//t.setId(obj.getId());
		
		List<Employee> employList  = new ArrayList<Employee>();
		employList.add(obj);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", employList);
		mv.setViewName("employeeList");
		return mv;
	}
	
	@PostMapping("/updateEmployee")
	public ModelAndView processUpdateTrainee(@ModelAttribute Employee t)
	{
		System.out.println("Insert a Trainee");
		rt.put(url + "/" + t.getEmployeeId(),t);
		
		System.out.println(t.toString());
		
		
		Employee obj = rt.getForObject(url + "/" + t.getEmployeeId(), Employee.class);
		//t.setId(obj.getId());
		
		List<Employee> employList  = new ArrayList<Employee>();
		employList.add(obj);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", employList);
		mv.setViewName("employeeList");
		return mv;
	}
	
	@PostMapping("/deleteEmployee")
	public ModelAndView processDeleteTrainee(@RequestParam int employeeId)
	{
		System.out.println("Deleted Employee Id: " + employeeId);
		rt.delete(url + "/" + employeeId);
		//t.setId(obj.getId());
		String str="Employee Deleted Successfully ✌";
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", str);
		mv.setViewName("view1");
		return mv;
	}
	
	

}

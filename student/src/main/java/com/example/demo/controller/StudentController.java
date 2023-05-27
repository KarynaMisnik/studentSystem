package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Person;
import com.example.demo.service.StudentService;


@RestController
@RequestMapping("/person")
@CrossOrigin
public class StudentController {
@Autowired
private StudentService studentService;

@PostMapping("/add")
public String add(@RequestBody Person person) {
	studentService.savePerson(person);
	return"New student is added";
}
@GetMapping("/getAll")
public List<Person> list(){
	return studentService.getAllPersons();
}
}

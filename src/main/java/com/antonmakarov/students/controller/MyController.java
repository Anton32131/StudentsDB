package com.antonmakarov.students.controller;

import com.antonmakarov.students.entity.Student;
import com.antonmakarov.students.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private StudentsService studentsService;

    @RequestMapping("/")
    public String showAllStudents(Model model){
        List<Student> allStudents = studentsService.getAllStudents();
        model.addAttribute("allStudents",allStudents);
        return "all-students";
    }
    @RequestMapping("/addNewStudent")
    public String addNewStudent(Model model ){

        Student student = new Student();
        model.addAttribute("student",student);
        return "student-info";
    }
    @RequestMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentsService.saveStudent(student);

        return  "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String updateStudent(@RequestParam("stdId") int id , Model model){
        Student student = studentsService.getStudent(id);
        model.addAttribute("student",student);

        return "student-info";
    }
    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("stdId") int id){
        studentsService.deleteStudent(id);
        return "redirect:/";
    }
}

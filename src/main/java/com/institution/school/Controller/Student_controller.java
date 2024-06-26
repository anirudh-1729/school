package com.institution.school.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.institution.school.Entity.Student;
import com.institution.school.Services.Student_services;

@RestController
@RequestMapping("/student-data")
public class Student_controller {
    
    @Autowired
    private Student_services student_record;

    @GetMapping("/all-record")
    public List<Student> getAllData(){

        return student_record.getAllData();
    }

    @GetMapping("/{id}")
    public Student getbyid (@PathVariable("id") Integer student_id){

        
        return student_record.getById(student_id);
    }

    @DeleteMapping("/delete-id/{id}")
    public String removeData(@PathVariable("id") Integer student_id){

        student_record.removeData(student_id);
        return "Record deleted successfully";
    }

    @PostMapping("/save-data")
    public void save_data( @RequestBody  Student student){
        
        student_record.save_data(student);//
    }

}

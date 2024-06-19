package com.institution.school.Services;
import com.institution.school.Entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class Student_services {
    
    @Autowired
    private Student_repo student_data;

    //Getting all data
    public List<Student> getAllData(){

        return student_data.findAll();
    }

    @SuppressWarnings("deprecation")
    public Student getById (Integer id){

        //return student_data.getById(id);
        return student_data.findById(id).
        orElseThrow(() -> new StudentNotFoundException("Student with ID " + id + " not found"));
    }

    //Removing data by id
    @SuppressWarnings("deprecation")
    public void removeData(Integer student_id){
 
       if(student_data.findById(student_id).isPresent()){
        student_data.deleteById( student_id);}
        else{
            throw new StudentNotFoundException("Student with ID" + student_id+ " does not exist. Cannot delete.");
        }
    }

    //Saving data
    public void save_data(Student student){

        if(student_data.findById(student.getStudent_id()).isPresent() ){
            throw new StudentNotFoundException("Student with ID" + student.getStudent_id()+ " already exists. Cannot add.");
        }
        else{
            student_data.save(student);
        }
        
    }
}

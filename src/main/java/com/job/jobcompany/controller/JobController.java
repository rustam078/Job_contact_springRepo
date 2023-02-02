
package com.job.jobcompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.job.jobcompany.model.JobPerson;
import com.job.jobcompany.service.JobServiceImpl;

@RestController
@CrossOrigin
public class JobController {
    @Autowired
    private JobServiceImpl jobservice;

    @PostMapping("/savejob")
    public String createjob(@RequestBody JobPerson jp){
        return jobservice.createjob(jp);
    }
    
    @GetMapping("/getlist")
    public List<JobPerson> displayAllList(){
        return jobservice.displayAllList();
    }

    @PutMapping("/update/{id}")
    public String UpdateContact(@PathVariable Integer id,@RequestBody JobPerson jb){
        return jobservice.updateJob(id,jb);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteJob(@PathVariable Integer id){
        return jobservice.deleteJob(id);
    }

    
}

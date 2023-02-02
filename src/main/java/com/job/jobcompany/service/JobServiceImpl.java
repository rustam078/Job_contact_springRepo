package com.job.jobcompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.jobcompany.model.JobPerson;
import com.job.jobcompany.repository.IJobRepository;
@Service
public class JobServiceImpl implements IJobService{

    @Autowired
    private IJobRepository irepo;

    @Override
    public String createjob(JobPerson jp) {
      Integer id=  irepo.save(jp).getId();
      if(id!=null)
        return "contact save sucessfully...";
        else
        return "contact not saved...";

    }

    @Override
    public String updateJob(Integer id, JobPerson jp) {
        jp.setId(id);
        return irepo.save(jp).getFirstName();
    }

    @Override
    public String deleteJob(Integer id) {
       if(irepo.existsById(id)){

           irepo.deleteById(id);
           return "deleted";
        }else{
           return "not deleted";

       }
    }

    @Override
    public List<JobPerson> displayAllList() {
        return irepo.findAll();
    }



 

    
}

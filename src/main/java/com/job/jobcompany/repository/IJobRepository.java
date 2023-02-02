package com.job.jobcompany.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.jobcompany.model.JobPerson;

@Repository
public interface IJobRepository extends JpaRepository<JobPerson,Integer> {
    
}

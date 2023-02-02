package com.job.jobcompany.service;
import java.util.List;

import com.job.jobcompany.model.JobPerson;
public interface IJobService {
    public String createjob(JobPerson jp);
    public String updateJob(Integer id,JobPerson jp);
    public String deleteJob(Integer id);
    public List<JobPerson> displayAllList();

}

package com.adhish.jobApp.service;

import java.util.*;
import com.adhish.jobApp.model.JobPost;
import com.adhish.jobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost)
    {
        repo.addJob(jobPost);
    }
    public List<JobPost> getAllJobs()
    {
        return repo.getAllJobs();
    }

}

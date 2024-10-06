package com.adhish.jobApp;

import com.adhish.jobApp.model.JobPost;
import com.adhish.jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    private JobService serivce;
    @GetMapping({"/","home"})
    public String home()
    {
        return "home";
    }
    @GetMapping("addjob")
    public String addJob()
    {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost)
    {
        serivce.addJob(jobPost);
        return "success";
    }
}

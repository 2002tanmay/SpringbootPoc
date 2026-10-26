package org.example.jobappspringboot;


import org.example.jobappspringboot.model.JobPost;
import org.example.jobappspringboot.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class JobRestController {

       @Autowired
      private JobService service;

      @GetMapping("/Jobposts")
      //@ResponseBody  // if we do not add this then browser will search for viewas or you can use restcontroller
    public List<JobPost> getAllJobs(){
           return service.getAllJobs();

    }
    @GetMapping("/Jobpost/{postId}")

    public JobPost getJob(@PathVariable("postId") int postID){
          return service.getJob(postID);
    }


     @PostMapping("/addJob")
    public void addJob(@RequestBody JobPost jobpost){  // add request body to send data in json to the server.
           service.addJob(jobpost);
    }

    @PutMapping("/Jobpost")

    public JobPost updateJob(@RequestBody  JobPost jobpost){
          service.updateJob(jobpost);
          return jobpost;
    }
    @DeleteMapping("Delete/{id}")

    public String deletejob(@PathVariable int id){
          service.deletejob(id);
          return "job deleted successfully";
    }

    @GetMapping("load") // mapping to load all data
    public String load(){
          service.load();
          return "success";
    }

    @GetMapping("jobpost/{keyword}")
    public List<JobPost> searchbykeyword(@PathVariable String keyword){
          return service.searchbykeyword(keyword);
    }
}



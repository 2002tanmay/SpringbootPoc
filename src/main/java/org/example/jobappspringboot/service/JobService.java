package org.example.jobappspringboot.service;


import org.example.jobappspringboot.model.JobPost;
import org.example.jobappspringboot.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;


    public void addJob(JobPost jobpost){
       System.out.println("new job added successfully");
      repo.save(jobpost);
   }

    public List<JobPost> getAllJobs(){

        return repo.findAll();
  }

        public JobPost getJob(int id){

//        int x = 1/0;  to test method crash by logging.

        return repo.findById(id).orElse(new JobPost());
    }


        public void updateJob(JobPost jobpost){
        repo.save(jobpost);
    }

        public void deletejob(int id){
        repo.deleteById(id);
    }

    public void load(){

        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
             new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                     List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


             new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                     List.of("HTML", "CSS", "JavaScript", "React")),


             new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                     List.of("Python", "Machine Learning", "Data Analysis")),


             new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                     List.of("Networking", "Cisco", "Routing", "Switching")),


             new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                     List.of("iOS Development", "Android Development", "Mobile App")),

        new JobPost(9, "System Engineer", "know about c and cpp also Java", 7,
                List.of("C", "CPP","Multithreading" , "System design"))
     ));

        repo.saveAll(jobs);
    }


    public List<JobPost> searchbykeyword(String keyword){
        return repo.findByPostProfileContainingOrDescriptionContaining(keyword,keyword);
    }
    // as we are using jpa and store data in DB we will use inbuilt method of jpa for db op

//    public void save(JobPost jobpost){
//        System.out.println("new job added successfully");
//        repo.Addjob(jobpost);
//    }
//
//    public List<JobPost> getAllJobs(){
//
//        return repo.getAlljobs();
//    }
//
//    public JobPost getJob(int id){
//        return repo.getJob(id);
//    }
//
//    public void addJob(JobPost jobpost){
//         repo.Addjob(jobpost);
//    }
//    public void updateJob(JobPost jobpost){
//        repo.updateJob(jobpost);
//    }
//
//
//    public void deletejob(int id){
//        repo.deletejob(id);
//    }
}

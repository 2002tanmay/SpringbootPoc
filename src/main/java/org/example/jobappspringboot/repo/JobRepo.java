package org.example.jobappspringboot.repo;

import org.example.jobappspringboot.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobRepo  extends JpaRepository<JobPost, Integer> {

    // if you need some customise method you can use this
  // the customise method declared here have no body . means no {};
    List<JobPost> findByPostProfileContainingOrDescriptionContaining(String postProfile, String description);





    // if we are using jPA and saving our data into DB then we do not need any of this code
     // we can use inbuilt method of JPA



//     List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//             new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                     List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//
//
//             new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
//                     List.of("HTML", "CSS", "JavaScript", "React")),
//
//
//             new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                     List.of("Python", "Machine Learning", "Data Analysis")),
//
//
//             new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
//                     List.of("Networking", "Cisco", "Routing", "Switching")),
//
//
//             new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
//                     List.of("iOS Development", "Android Development", "Mobile App"))
//     ));
//
//     public List<JobPost> getAlljobs(){
//         return jobs;
//     }
//
//     public void Addjob(JobPost job){
//         jobs.add(job);  // here we are adding new element to the object of jobpost.
//     }
//
//     public JobPost getJob(int postId){
//
//         for(JobPost j:jobs){
//             if(j.getId()==postId){
//                 return j;
//             }
//
//         }
//         return null;
//     }
//
//     public void updateJob(JobPost jobpost){
//
//         for(JobPost j:jobs){
//             if(j.getId()==jobpost.getId()){
//                 j.setDescription(jobpost.getDescription());
//                 j.setPostProfile(jobpost.getPostProfile());
//                 j.setRequiredExperience(jobpost.getRequiredExperience());
//                 j.setTechStack(jobpost.getTechStack());
//             }
//         }
//     }
//
//
//     public void deletejob(int id){
//         for(JobPost j:jobs){
//             if(j.getId()==id){
//                 jobs.remove(j);
//             }
//         }
//     }



}

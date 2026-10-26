package org.example.jobappspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Entity
    public class JobPost {
         @Id
        private int id;
        private String postProfile;
        private String description;
        private int requiredExperience;
        private List<String> techStack;
    }

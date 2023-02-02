package com.job.jobcompany.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class JobPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      private Integer  id;
      private String firstName;
      private String email;
     private String lastName;
     private Date dob;
     private String gender;
     private String education;
     private String company;
     private Integer experience;
     private Float packagee;
    
}

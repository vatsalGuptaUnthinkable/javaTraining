package com.Unthinkable.SpringBootPractice.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;
    private String employeeFname;
    private String employeeLname;


    @ManyToOne
    @JoinColumn(name = "department_department_id")
    private Department department;

    
}

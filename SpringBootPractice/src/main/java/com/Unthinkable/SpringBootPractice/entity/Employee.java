package com.Unthinkable.SpringBootPractice.entity;


import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Eid;
    private String employeeName;
    private String employeeRole;

    @ManyToOne
    @JoinColumn(name = "departmentId" , nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Department department;

}

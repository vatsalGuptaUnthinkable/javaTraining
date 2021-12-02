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
    private String EmployeeName;
    private String EmployeeRole;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "departmentId" , nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Department department;

}

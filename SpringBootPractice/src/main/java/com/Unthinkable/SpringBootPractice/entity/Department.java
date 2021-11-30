package com.Unthinkable.SpringBootPractice.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long DepartmentId;
    private String deparmentName;
    private String departmentAddress;
    private String departmentCode;

}

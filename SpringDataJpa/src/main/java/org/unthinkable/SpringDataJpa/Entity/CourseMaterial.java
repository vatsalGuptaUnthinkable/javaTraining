package org.unthinkable.SpringDataJpa.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseMaterial {

    @Id
    @SequenceGenerator(name = "Gen" ,
            sequenceName = "seq" ,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq")
    private long courseMaterialId;
    private String url;

    @OneToOne
    @JoinColumn(
            name ="course_id",
            referencedColumnName = "courseId"
    )
    private Course course;
}

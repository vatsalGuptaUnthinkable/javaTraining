package org.unthinkable.SpringDataJpa.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Gaurdian {

    private String gaurdianName;
    private String gaurdianEmail;
    private String gaurdianMobile;
}

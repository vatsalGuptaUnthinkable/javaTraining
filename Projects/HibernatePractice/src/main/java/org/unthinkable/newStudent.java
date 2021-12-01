package org.unthinkable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class newStudent {
    @Id
    private int id;
    private String name;
    private Certificate certificate;
    public newStudent() {
    }

    @Override
    public String toString() {
        return "newStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", certificate=" + certificate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }


}

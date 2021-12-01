package org.unthinkable;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate
{
    public Certificate() {

    }

    public String getCertiName() {
        return certiName;
    }

    public void setCertiName(String certiName) {
        this.certiName = certiName;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    private String certiName;
    private String organ;

}

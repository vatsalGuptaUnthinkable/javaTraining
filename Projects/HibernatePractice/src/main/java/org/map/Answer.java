package org.map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

    @Id
    private int aId;
    private String answers;

    public Answer(int aId, String answers) {
        this.aId = aId;
        this.answers = answers;
    }
    public Answer(){}

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "aId=" + aId +
                ", answers='" + answers + '\'' +
                '}';
    }
}

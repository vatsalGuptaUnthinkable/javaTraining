package org.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {

    @Id
    private int qId;

    @Override
    public String toString() {
        return "Question{" +
                "qId=" + qId +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }

    public Question() {
    }

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    private String question;

    @OneToOne
    Answer answer;
}

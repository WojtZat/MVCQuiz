package com.MVCQuiz.Entity;

import java.util.Objects;

public class Question
{

    private String questionTitle;
    private String questionText;
    private String answer;

    public Question(String questionTitle, String questionText) {
        this.questionTitle = questionTitle;
        this.questionText = questionText;
        this.answer = "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(getQuestionTitle(), question.getQuestionTitle()) &&
                Objects.equals(getQuestionText(), question.getQuestionText()) &&
                Objects.equals(getAnswer(), question.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionTitle(), getQuestionText(), getAnswer());
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

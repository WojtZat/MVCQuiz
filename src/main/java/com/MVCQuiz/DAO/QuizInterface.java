package com.MVCQuiz.DAO;

import com.MVCQuiz.Entity.Question;
import javafx.collections.ObservableList;

public interface QuizInterface {
    boolean add(String header, String text);
    boolean delete(int i);
    ObservableList<Question> drawQuestionSet(int numberOfQuestions);
    void clear();
    boolean delete(Question q);
    ObservableList<Question> getList();
    boolean add(Question question);
    void editQuestion(Question oldQuestion, Question editedQuestion);
}


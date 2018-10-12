package com.MVCQuiz.DAO;

import com.MVCQuiz.Entity.Question;
import javafx.collections.ObservableList;

public class SQLiteQuiz implements QuizInterface {
    @Override
    public boolean add(String header, String text) {
        return false;
    }

    @Override
    public boolean delete(int i) {
        return false;
    }

    @Override
    public ObservableList<Question> drawQuestionSet(int numberOfQuestions) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean delete(Question q) {
        return false;
    }

    @Override
    public ObservableList<Question> getList() {
        return null;
    }

    @Override
    public boolean add(Question question) {
        return false;
    }

    @Override
    public void editQuestion(Question oldQuestion, Question editedQuestion) {

    }
}

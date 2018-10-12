package com.MVCQuiz.Service;

import com.MVCQuiz.DAO.MemoryQuiz;
import com.MVCQuiz.DAO.QuizInterface;

public class QuizService {

    private QuizInterface quizService = new MemoryQuiz();
}

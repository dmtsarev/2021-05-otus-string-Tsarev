package ru.otus.spring._2021_05_Tsarev.dao;

import ru.otus.spring._2021_05_Tsarev.domain.Question;

public interface QuestionDao {
    Question getByNumber(int questionNumber);

    Integer getQuestionsCount();
}

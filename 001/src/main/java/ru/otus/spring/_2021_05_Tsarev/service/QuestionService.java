package ru.otus.spring._2021_05_Tsarev.service;

import ru.otus.spring._2021_05_Tsarev.domain.Question;

public interface QuestionService {

    Question getByNumber(int questionNumber);
    Integer getQuestionsCount();
}

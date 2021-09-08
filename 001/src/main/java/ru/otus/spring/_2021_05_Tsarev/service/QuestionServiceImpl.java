package ru.otus.spring._2021_05_Tsarev.service;


import ru.otus.spring._2021_05_Tsarev.dao.QuestionDao;
import ru.otus.spring._2021_05_Tsarev.domain.Question;

public class QuestionServiceImpl implements QuestionService {

    private final QuestionDao dao;

    public QuestionServiceImpl(QuestionDao dao) {
        this.dao = dao;
    }

    public Question getByNumber(int questionNumber) {
        return dao.getByNumber(questionNumber);
    }

    public Integer getQuestionsCount() {
        return dao.getQuestionsCount();
    }
}

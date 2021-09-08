package ru.otus.spring._2021_05_Tsarev.dao;

import ru.otus.spring._2021_05_Tsarev.domain.Option;
import ru.otus.spring._2021_05_Tsarev.domain.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionDaoSimple implements QuestionDao {

    private List<Question> questions;

    public QuestionDaoSimple() {

    }

    public QuestionDaoSimple(String resource) {
        questions = new ArrayList<>();
        Scanner scanner = new Scanner(QuestionDaoSimple.class.getResourceAsStream(resource));
        scanner.useDelimiter(",");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] splitedLine = line.split(",");
            Question q = new Question();
            q.setQuestion(splitedLine[0]);
            List<Option> options = new ArrayList<Option>();
            for (int i = 1; i < splitedLine.length; i++) {
                options.add(new Option(splitedLine[i], false));
            }
            q.setOptions(options);
            questions.add(q);
        }

    }

    public Question getByNumber(int questionNumber) {


        return questions.get(questionNumber);
    }

    @Override
    public Integer getQuestionsCount() {
        return questions.size();
    }


}

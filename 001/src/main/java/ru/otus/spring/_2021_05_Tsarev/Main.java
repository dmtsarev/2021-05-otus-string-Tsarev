package ru.otus.spring._2021_05_Tsarev;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring._2021_05_Tsarev.domain.Option;
import ru.otus.spring._2021_05_Tsarev.domain.Question;
import ru.otus.spring._2021_05_Tsarev.service.QuestionService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        QuestionService service = context.getBean(QuestionService.class);
        for (int i = 0; i < service.getQuestionsCount(); i++) {
            Question question = service.getByNumber(i);
            System.out.println("Question: " + question.getQuestion());
            System.out.println("    Options:");
            for (Option option : question.getOptions()) {
                System.out.println("      " + option.getOption());
            }
        }


        // Данная операция, в принципе не нужна.
        // Мы не работаем пока что с БД, а Spring Boot сделает закрытие за нас
        // Подробности - через пару занятий
        context.close();
    }


}

package com.quest.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class QuestService {
    public static QuestService questService = new QuestService();
    Question currentQuestion = Quest.getInstance().getCurrentQuestion();

    public void nextQuestion(Question parameter, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        switch (parameter) {
            case NULL -> currentQuestion = Question.ONE;
            case ONE -> {
                currentQuestion = Question.TWO;
                Quest.getInstance().setStartQuestion(Question.NEXT);
            }
            case TWO -> {
                currentQuestion = Question.THREE;
                Quest.getInstance().setStartQuestion(Question.NEXT_2);
            }
            case THREE -> {
                currentQuestion = Question.FOUR;
                Quest.getInstance().setStartQuestion(Question.NEXT);
            }
            case FOUR -> {
                currentQuestion = Question.FIVE;
                Quest.getInstance().setStartQuestion(Question.NEXT_2);
            }
            case FIVE -> {
                currentQuestion = Question.SIX;
                Quest.getInstance().setStartQuestion(Question.NEXT);
            }
            case SIX -> {
                currentQuestion = Question.SEVEN;
                Quest.getInstance().setStartQuestion(Question.NEXT_2);
            }
            case SEVEN -> goodEnd(req, resp);
            case DRUNK -> badEnd(req, resp);
        }
        Quest.getInstance().setCurrentQuestion(currentQuestion);
    }

    private void goodEnd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Quest.getInstance().setCurrentQuestion(Question.GOOD_END);
        req.getServletContext().getRequestDispatcher(JSPPath.GOOD_END.getPath()).forward(req, resp);
    }

    private void badEnd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (new Random().nextBoolean()) {
            Quest.getInstance().setStartQuestion(Question.BAD_RESULT_ONE);
        } else {
            Quest.getInstance().setStartQuestion(Question.BAD_RESULT_TWO);
        }
        Quest.getInstance().setCurrentQuestion(Question.BAD_END);
        req.getServletContext().getRequestDispatcher(JSPPath.BAD_END.getPath()).forward(req, resp);
    }

    public void initQuest(String name) {
        Quest.getInstance().setUserName(name);
        if (Quest.getInstance().getCurrentQuestion() == null) {
            Quest.getInstance().setCurrentQuestion(Question.ONE);
            Quest.getInstance().setStartQuestion(Question.ZERO);
        }
    }

    public void invalidateQuest() {
        Quest.getInstance().setStartQuestion(Question.ZERO);
        Quest.getInstance().setCurrentQuestion(null);
        Quest.getInstance().setUserName(null);
    }
}

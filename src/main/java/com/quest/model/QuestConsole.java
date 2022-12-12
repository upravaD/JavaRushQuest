package com.quest.model;

import java.util.Scanner;

public class QuestConsole {
    private final Scanner scanner = new Scanner(System.in);
    private String userName;
    private Question currentQuestion;

    public QuestConsole() {
        welcome();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }

    private void welcome() {
        System.out.println(Question.WELCOME.getQuestion() + "\nWhat is your name?");
        this.userName = scanner.nextLine();
    }

    private void questLogic(Question good) {
        // Задаем вопросы
        System.out.println("1. " + good.getQuestion());
        System.out.println("2. " + Question.DRUNK.getQuestion());
        // Ждем ответ
        int answer = scanner.nextInt();
        // Если выбрали второй ответ
        if (answer == 2) {
            // Если это стартовый вопрос
            if (currentQuestion == Question.ZERO) {
                // Тогда первый вариант плохих последствий
                System.out.println(Question.BAD_RESULT_ONE.getQuestion());
            } else {
                // Иначе второй вариант
                System.out.println(Question.BAD_RESULT_TWO.getQuestion());
            }
            // Игра заканчивается поражением
            System.out.println(Question.BAD_END.getQuestion());
            currentQuestion = Question.BAD_END;
        // Если выбрали первый ответ
        } else {
            currentQuestion = good;
            if (currentQuestion == Question.SEVEN) {
                System.out.println(Question.GOOD_END.getQuestion());
                currentQuestion = Question.GOOD_END;
            }
        }
    }

    public void startQuest() {
        if (!userName.isEmpty()) {
            System.out.println(Question.ZERO.getQuestion());
            currentQuestion = Question.ZERO;
        }
        while (!(currentQuestion == Question.BAD_END || currentQuestion == Question.GOOD_END)) {
            switch (currentQuestion) {
                case ZERO -> questLogic(Question.ONE);
                case ONE -> questLogic(Question.TWO);
                case TWO -> questLogic(Question.THREE);
                case THREE -> questLogic(Question.FOUR);
                case FOUR -> questLogic(Question.FIVE);
                case FIVE -> questLogic(Question.SIX);
                case SIX -> questLogic(Question.SEVEN);
            }
        }
    }
}

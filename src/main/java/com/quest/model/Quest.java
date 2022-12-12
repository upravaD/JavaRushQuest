package com.quest.model;

public class Quest {
    private String userName;
    private static Quest quest;
    private Question currentQuestion;

    private Quest(){

    }

    public static Quest getInstance(){
        if (quest == null) {
            quest = new Quest();
        }
        return quest;
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }
    public void setCurrentQuestion(Question currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}

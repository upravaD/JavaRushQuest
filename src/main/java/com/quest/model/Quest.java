package com.quest.model;

/**
 *  Quest Model
 */

public class Quest {
    private static Quest quest;
    private String userName;
    private Question currentQuestion;
    private Question startQuestion;

    private Quest(){

    }

    public static Quest getInstance(){
        if (quest == null) {
            quest = new Quest();
        }
        return quest;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Question getCurrentQuestion() {
        return currentQuestion;
    }
    public void setCurrentQuestion(Question currentQuestion) {
        this.currentQuestion = currentQuestion;
    }
    public Question getStartQuestion() {
        return startQuestion;
    }
    public void setStartQuestion(Question startQuestion) {
        this.startQuestion = startQuestion;
    }
}

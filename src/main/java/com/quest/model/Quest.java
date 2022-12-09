package com.quest.model;

public class Quest {
    private String userName;

    public static Quest quest = new Quest();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

package com.quest;

import com.quest.model.Question;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
//        Quest quest = new Quest();
//        quest.startQuest();
        System.out.println(Question.WELCOME.getQuestion());
        System.out.println(ZonedDateTime.now());
    }
}

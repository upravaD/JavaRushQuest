package com.quest.model;

/**
 *  Quest DataBase
 */

public enum Question {

    // Service
    WELCOME("Welcome to JavaRush Quest!\n"),
    NEXT("Next question!"),
    NEXT_2("Excellent choice!"),
    ZERO("\nThere is clearly a need to change something in life."),
    CHOOSE("What do you choose?"),
    NULL(null),

    // Positive way,
    ONE("Go to study at JavaRush."),
    TWO("Learn Java Syntax."),
    THREE("Learn Java Core."),
    FOUR("Learn Java Professional."),
    FIVE("Learn SQL & Hibernate."),
    SIX("Learn Spring."),
    SEVEN("Develop a SUPER APP!"),
    GOOD_END("\nCongratulations!!!\nYou got a good offer at your new job!"),

    // Negative way
    DRUNK("Let`s go get drunk!"),
    BAD_RESULT_ONE("\nA long and boring life..."),
    BAD_RESULT_TWO("\nProblem with sick head..."),
    BAD_END("\nSAD END");

    private final String question;

    Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
}

package com.quest.controller;

import com.quest.model.Quest;
import com.quest.model.Question;

public interface QuestInitialize {
    default void initQuest(String name) {
        Quest.getInstance().setUserName(name);
        if (Quest.getInstance().getCurrentQuestion() == null) {
            Quest.getInstance().setCurrentQuestion(Question.ONE);
            Quest.getInstance().setStartQuestion(Question.ZERO);
        }
    }

    default void invalidateQuest() {
        Quest.getInstance().setStartQuestion(Question.ZERO);
        Quest.getInstance().setCurrentQuestion(null);
        Quest.getInstance().setUserName(null);
    }
}

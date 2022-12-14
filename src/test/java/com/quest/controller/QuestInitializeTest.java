package com.quest.controller;

import com.quest.model.Quest;
import com.quest.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuestInitializeTest {

    @Test
    public void initQuest() {
        // GIVEN
        Quest testQuest = Quest.getInstance();
        String name = "test";
        testQuest.setCurrentQuestion(null);

        // WHEN
        testQuest.initQuest(name);

        // THEN
        Assertions.assertEquals(testQuest.getCurrentQuestion(), Question.ONE);
        Assertions.assertEquals(testQuest.getStartQuestion(), Question.ZERO);
    }

    @Test
    public void invalidateQuest() {
        // GIVEN
        Quest testQuest = Quest.getInstance();

        // WHEN
        testQuest.invalidateQuest();

        // THEN
        Assertions.assertEquals(testQuest.getStartQuestion(), Question.ZERO);
        Assertions.assertNull(testQuest.getCurrentQuestion());
        Assertions.assertNull(testQuest.getUserName());
    }
}
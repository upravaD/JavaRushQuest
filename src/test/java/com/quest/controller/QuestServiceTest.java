package com.quest.controller;

import com.quest.model.Quest;
import com.quest.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Random;

class QuestServiceTest {
    @Mock
    HttpServletRequest testRequest;
    @Mock
    HttpServletResponse testResponse;

    @Test
    void nextQuestion() {
        // GIVEN
        Quest testQuest = Quest.getInstance();
        List<Question> testParameters = List.of(
                Question.ONE,
                Question.TWO,
                Question.THREE,
                Question.FOUR,
                Question.FIVE,
                Question.SIX
        );
        int index = new Random().nextInt(testParameters.size());

        // WHEN
        try{
            testQuest.nextQuestion(testParameters.get(index), testRequest, testResponse);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

        // THEN
        switch (index) {
            case 0 -> Assertions.assertEquals(testQuest.getCurrentQuestion(), Question.TWO);
            case 1 -> Assertions.assertEquals(testQuest.getCurrentQuestion(), Question.THREE);
            case 2 -> Assertions.assertEquals(testQuest.getCurrentQuestion(), Question.FOUR);
            case 3 -> Assertions.assertEquals(testQuest.getCurrentQuestion(), Question.FIVE);
            case 4 -> Assertions.assertEquals(testQuest.getCurrentQuestion(), Question.SIX);
            case 5 -> Assertions.assertEquals(testQuest.getCurrentQuestion(), Question.SEVEN);
        }
    }
}
package com.quest.servlet;

import com.quest.model.JSPPath;
import com.quest.model.QuestService;
import com.quest.model.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QuestServlet", value = "/quest")
public class QuestServlet extends HttpServlet {
    QuestService questService = new QuestService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String choose = req.getParameter("choose");

        if (choose == null) {
            getServletContext()
                    .getRequestDispatcher(JSPPath.QUEST.getPath())
                    .forward(req, resp);
        } else {
            QuestService.questService.nextQuestion(Question.valueOf(choose), req, resp);
            getServletContext()
                    .getRequestDispatcher(JSPPath.QUEST.getPath())
                    .forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

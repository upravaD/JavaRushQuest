package com.quest.servlet;

import com.quest.model.JSPPath;
import com.quest.model.Quest;
import com.quest.model.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QuestServlet", value = "/quest")
public class QuestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String choose = req.getParameter("choose");

        String jspPath;
        if (choose == null) {
            jspPath = JSPPath.QUEST.getPath();
        } else {
            Quest.getInstance().nextQuestion(Question.valueOf(choose), req, resp);
            jspPath = JSPPath.QUEST.getPath();
        }

        getServletContext()
                .getRequestDispatcher(jspPath)
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

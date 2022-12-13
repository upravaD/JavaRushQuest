package com.quest.servlet;

import com.quest.model.JSPPath;
import com.quest.model.QuestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet", value = "/reg")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        QuestService.questService.initQuest(name);

        if (name == null) {
            getServletContext()
                    .getRequestDispatcher(JSPPath.REG.getPath())
                    .forward(req, resp);
        } else {
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

package com.quest.servlet;

import com.quest.model.JSPPath;
import com.quest.model.QuestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StartServlet", value = "/start")
public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Перенаправление запроса на страницу index.jsp через сервер
        getServletContext()
                .getRequestDispatcher(JSPPath.INDEX.getPath())
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        QuestService.questService.invalidateQuest();
        // Перенаправление запроса на страницу index.jsp через сервер
        getServletContext()
                .getRequestDispatcher(JSPPath.INDEX.getPath())
                .forward(req, resp);
    }
}

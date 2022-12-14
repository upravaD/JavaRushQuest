package com.quest.servlet;

import com.quest.model.JSPPath;
import com.quest.model.Quest;

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
        req.getSession(true).setAttribute("name", name);
        Quest.getInstance().initQuest(name);

        String jspPath;
        if (name == null) {
            jspPath = JSPPath.REG.getPath();
        } else jspPath = JSPPath.QUEST.getPath();

        getServletContext()
                .getRequestDispatcher(jspPath)
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}

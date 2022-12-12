package com.quest.servlet;

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
        String result = req.getParameter("name");
        Quest.getInstance().setUserName(result);

        if (result == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/registration.jsp").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/quest/zero.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

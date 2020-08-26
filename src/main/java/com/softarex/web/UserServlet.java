package com.softarex.web;

import com.softarex.model.UserMap;
import org.primefaces.shaded.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/members")
public class UserServlet extends HttpServlet {

    private UserMap user = new UserMap();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("Enter doPost");
        user.getUsersMap();

        String name = req.getParameter("userName");

        if (!user.getUserByName(name)){
            user.addUser(name);
            System.out.println("user добавлен: " + name);
            req.setAttribute("name", name);
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }//todo сделать страницу с ошибкой
        System.out.println("usersMap: " + user.getUsersMap());
    }


}


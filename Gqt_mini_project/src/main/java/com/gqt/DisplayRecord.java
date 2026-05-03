package com.gqt;

import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.hibernate.*;

@WebServlet("/DisplayRecord")
public class DisplayRecord extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Query<Student> q = session.createQuery("from Student", Student.class);
        List<Student> resultlist = q.getResultList();

        session.close();

        request.setAttribute("studentList", resultlist);

        request.getRequestDispatcher("disp.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
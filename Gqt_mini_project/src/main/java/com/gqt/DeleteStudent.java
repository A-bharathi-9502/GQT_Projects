package com.gqt;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.hibernate.*;

@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sid = request.getParameter("sid");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            Student s = session.get(Student.class, sid);

            if (s != null) {
                session.delete(s);
                tx.commit();

                request.getSession().setAttribute("msg", "Student Deleted Successfully ✅");

            } else {
                request.getSession().setAttribute("msg", "Student Not Found ❌");
            }

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }

        session.close();

        response.sendRedirect("DisplayRecord");
    }
}
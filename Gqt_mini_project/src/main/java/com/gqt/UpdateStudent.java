package com.gqt;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.hibernate.*;

@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sid = request.getParameter("sid");
        String name = request.getParameter("name");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            Student s = session.get(Student.class, sid);

            if (s != null) {
                s.setName(name);

                session.update(s);
                tx.commit();

                request.getSession().setAttribute("msg", "Updated Successfully");

            } else {
                request.getSession().setAttribute("msg", "Student Not Found");
            }

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();

            request.getSession().setAttribute("msg", "Error while updating");
        }

        session.close();
        response.sendRedirect("DisplayRecord");
    }
}
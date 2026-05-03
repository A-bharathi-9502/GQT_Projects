package com.gqt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;

@WebServlet("/SaveRecord")
public class SaveRecord extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String sid = request.getParameter("sid");
        String name = request.getParameter("fn");
        String gender = request.getParameter("gender");
        String city = request.getParameter("city");
        String course = request.getParameter("course");
        String amtStr = request.getParameter("amount");
         float amount = Float.parseFloat(request.getParameter("amount"));
         //sending data to the entity class(student)
         Student s=new Student();
         s.setSid(sid);
         s.setName(name);
         s.setGender(gender);
         s.setCity(city);
         s.setCourse(course);
         s.setCourse(course);
         s.setAmount(amount);
         //saving student object into table using hibernate
         SessionFactory sf=new Configuration().configure().buildSessionFactory();
         Session session=sf.openSession();
         session.beginTransaction();
         session.save(s);session.getTransaction().commit();
         session.close();
         //loading save.jsp
         response.sendRedirect("save.jsp");
       
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
    	doGet(request,response);
    }
    }
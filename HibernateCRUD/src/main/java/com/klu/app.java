package com.klu;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class app {
    public static void main(String[] args) {
        // CREATE
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        student s1 = new student(101, "Ram", "CSE");
        session.save(s1);
        tx.commit();
        session.close();
        System.out.println("Student Inserted");
        // READ
        session = HibernateUtil.getSessionFactory().openSession();
        student s = session.get(student.class, 101);
        System.out.println(s.getName() + " " + s.getDept());
        session.close();
        // UPDATE
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        s.setDept("AI & DS");
        session.update(s);
        tx.commit();
        session.close();
        System.out.println("Student Updated");
        // DELETE
        //session = HibernateUtil.getSessionFactory().openSession();
        //tx = session.beginTransaction();
        //session.delete(s);
        //tx.commit();
        //session.close();
        //System.out.println("Student Deleted");
    }
}

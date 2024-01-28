package lk.ijse.fx;

import lk.ijse.fx.Embed.FullName;
import lk.ijse.fx.config.FactoryConfiguration;
import lk.ijse.fx.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Shameen","Dilusha");
        Student student = new Student();
        student.setId(2);
        student.setName(fullName);
        student.setAddress("Panadura");


        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        //session.save(student);
        //session.update(student);
        //session.delete(student);
        Student s = session.get(Student.class,1);
        System.out.println(s);

        transaction.commit();
        session.close();
    }
}
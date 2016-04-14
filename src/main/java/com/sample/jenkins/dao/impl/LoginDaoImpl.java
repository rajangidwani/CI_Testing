package com.sample.jenkins.dao.impl;

import com.sample.jenkins.beans.LoginDetail;
import com.sample.jenkins.dao.LoginDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by rgidwani on 09-04-2016.
 */
@Component
public class LoginDaoImpl implements LoginDao {

    SessionFactory factory;

    @Override
    public boolean authenticateUser(String username, String password) throws Exception{
        try{
            Configuration cfg=new Configuration();
            cfg.configure();
            factory=cfg.buildSessionFactory();
            Session session=factory.openSession();
            Transaction t=session.beginTransaction();
            LoginDetail loginDetail = new LoginDetail(username,password);
            String hql = "Select count(*) from LoginDetail where username=:username and password=:password";
            System.out.println(hql);
            Query query = session.createQuery(hql);
            query.setParameter("username", loginDetail.getUsername());
            query.setParameter("password", loginDetail.getPassword());
            Long count = (Long)query.uniqueResult();
            if(count > 0){
                return true;
            }
            t.commit();
        }catch (Exception e){
            throw e;
        }
        return false;
    }

    @Override
    public void signUp(String usename, String password) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        LoginDetail loginDetail = new LoginDetail(usename,password);
        session.save(loginDetail);
        t.commit();
    }
}
package cn.happy.dao;

import cn.happy.bean.Dept;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Repository("deptDAO")
public class DeptDAOImpl implements IDeptDAO{


    @Resource
    private SessionFactory sessionFactory;

    public int addDept(Dept dept) {
        Serializable count = sessionFactory.getCurrentSession().save(dept);
        return (Integer) count;
    }

    public List<Dept> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Dept").list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

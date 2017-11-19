package cn.happy.service;

import cn.happy.bean.Dept;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Happy on 2017-10-11.
 */
public interface IDeptService {
    public int addDept(Dept dept);
    public List findAll();
}

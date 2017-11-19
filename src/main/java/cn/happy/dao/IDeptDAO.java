package cn.happy.dao;

import cn.happy.bean.Dept;

import java.util.List;

/**
 * Created by Happy on 2017-10-11.
 */
public interface IDeptDAO {
    //添加部门的方法
    public int addDept(Dept dept);
    public List findAll();
}

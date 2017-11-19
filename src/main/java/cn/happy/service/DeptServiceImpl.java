package cn.happy.service;

import cn.happy.bean.Dept;
import cn.happy.dao.IDeptDAO;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;




@Service("deptService")
public class DeptServiceImpl implements  IDeptService {

    @Resource
    private IDeptDAO dao;

    public int addDept(Dept dept) {
        int result=dao.addDept(dept);
        return result;
    }

    public List findAll() {
        return dao.findAll();
    }


    public IDeptDAO getDao() {
        return dao;
    }

    public void setDao(IDeptDAO dao) {
        this.dao = dao;
    }
}

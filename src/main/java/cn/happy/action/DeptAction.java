package cn.happy.action;

import cn.happy.bean.Dept;
import cn.happy.service.IDeptService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by micro on 2017/10/29.
 */

@Controller
@Scope(value = "prototype")
@ParentPackage("struts-default")
@Namespace("/")
public class DeptAction extends ActionSupport {

    private Dept dept;

    @Resource(name = "deptService")
    private IDeptService deptService;


    @Action(value = "addAction",results = {@Result( name = "success",location = "/jsp/index.jsp"),@Result(name="input",location = "/jsp/add.jsp")})
    public String addDept(){
        int count = deptService.addDept(dept);
        if(count>0){
            return "success";
        }
        return "input";
    }





    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public IDeptService getDeptService() {
        return deptService;
    }

    public void setDeptService(IDeptService deptService) {
        this.deptService = deptService;
    }
}

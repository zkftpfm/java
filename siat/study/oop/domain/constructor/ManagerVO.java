package siat.study.oop.domain.constructor;

public class ManagerVO extends PersonVO{
    private String dept ;

    public ManagerVO() {

    }

    public ManagerVO(String name, String addr, String dept) {
        super.setName(name);
        super.setAddr(addr);
        this.setDept(dept);
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }
    
    public String empInfo() {
        return super.perInfo()+"\t 부서 :"+this.getDept();
}

}
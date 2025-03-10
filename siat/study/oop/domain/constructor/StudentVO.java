package siat.study.oop.domain.constructor;

public class StudentVO extends PersonVO{
    
        private String stuID ;

        public StudentVO() {

        }

        public StudentVO(String name, String addr, String stuId) {
            super.setName(name);
            super.setAddr(addr);
            this.setStuID(stuId);
        }

        public void setStuID(String stuID) {
            this.stuID = stuID;
        }

        public String getStuID() {
            return stuID;
        }


        public String stuInfo() {
            return super.perInfo()+"\t 학번 :"+this.getStuID() ;

}
}

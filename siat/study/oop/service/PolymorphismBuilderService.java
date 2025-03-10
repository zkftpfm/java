package siat.study.oop.service;

import lombok.Builder;
import siat.study.oop.domain.builder.ManagerVO;
import siat.study.oop.domain.builder.PersonVO;
import siat.study.oop.domain.builder.StudentVO;
import siat.study.oop.domain.builder.TeacherVO;
import siat.study.oop.util.EnumOop;

@Builder
public class PolymorphismBuilderService {
    
    private siat.study.oop.domain.builder.PersonVO [] perAry ;
    private int idx ;


    
    public void makePerson(EnumOop division, String name, String addr, String comm) {
        
        switch(division.getDivision()) {
            case "강사" :
                TeacherVO tea = TeacherVO.builder()
                                        .name(name)
                                        .addr(addr)
                                        
                                                                
                setPerson(tea);
                break;
            case "학생" :
                StudentVO stu = new StudentVO(name, addr, comm);
                setPerson(stu);
                break;
            case "매니저" :
                ManagerVO emp = new ManagerVO(name, addr, comm);
                setPerson(emp);
                break;
        }
    }
}
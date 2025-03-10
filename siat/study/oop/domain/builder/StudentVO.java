package siat.study.oop.domain.builder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class StudentVO extends PersonVO{
    
        private String stuID ;


        public String stuInfo() {
            return super.perInfo()+"\t 학번 :"+this.getStuID() ;

}
}

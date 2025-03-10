
import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.StudentVO;

public class OopMain {

    // OOP(Object Oriented Programming)
    // 은닉화
    // 상속
    // 다형성(타입, 매개변수, 메서드)
    // 추상화
    public static void main(String[] args) {

        // 생성자
        StudentVO stu = new StudentVO("영석", "동탄", "21");
        System.out.println(stu.perInfo());
        System.out.println(stu.stuInfo());

        ManagerVO emp = new ManagerVO("진규썜", "한국", "siat");
        System.out.println(emp.perInfo()); 
        System.out.println(emp.empInfo());

        // 빌더

        // ///////

        PersonVO stu01 = new StudentVO("영석", "동탄", null);
        System.out.println(stu01.perInfo());
        System.out.println(((StudentVO)stu01).stuInfo());

        PersonVO emp01 = new ManagerVO("진규쌤", "한국", null);
        System.out.println(emp01.perInfo());
        System.out.println(((ManagerVO)emp01).empInfo());

        // 
        System.out.println(">>>> 다형성");
        PersonVO [] perAry = new PersonVO[3];
        perAry[0] = stu ;
        perAry[1] = emp ;

        for(int idx=0 ; idx < perAry.length ; idx++) {
            PersonVO per = perAry[idx] ;
            // instanceof 연산자 : 객체타입을 비교해주는 연산자
            if(per instanceof StudentVO) {
                System.out.println(((StudentVO)per).stuInfo());
            }
            if(per instanceof ManagerVO) {
                System.out.println(((ManagerVO)per).empInfo());
            }
        }
    }
}
